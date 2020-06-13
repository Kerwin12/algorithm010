## 学习笔记

### 五毒神掌刷题法
    1. 刷题第一遍：
        - 五分钟：读题 + 思考
        - 直接看解法：多解法要比较解法优劣
    2. 刷题第二遍
        - 马上自己写，LeetCode提交
        - 多解法比较、体会 -> 优化
    3. 刷题第三遍
        - 过了一天后，再重复做题
    4. 刷题第四遍
        - 过了一周：反复回来练习相同的题目，不熟练的题目反复练习
    5. 面试前一周恢复训练
    
### 数组

#### 特点
    1. 内存地址连续
    2. 访问时间复杂度 O(1)
    3. 插入中间或删除中间需要位移其他元素，修改的时间复杂度为 O(n)
    4. 前插 O(1)，可采用申请稍大内存空间，数组最开始的地方预留的方式降低复杂度至 O(1)，正常是 O(n)
    5. 后插 O(1)

### 链表

#### 特点
    1. 内存地址不连续
    2. 访问时间复杂度 O(n)
    3. 插入或删除中间元素的时间复杂度 O(1)
    4. 前插（头插）O(1)
    5. 后插（尾插）O(1)
    
#### 标准实现
```java
class LinkedList {
    Node head; // head of list
    
    /* Linked list node */
    class Node {
        int data;
        Node next;
        
        // Constructor to create a new node
        // Next is by default initialized 
        // as null
        Node(int d) {
            data = d;
        }   
    }
}
``` 

#### 链表插入元素的过程
    1. 插入节点的 next 指针指向前驱节点的 next;
    2. 前驱节点的 next 指针指向插入节点;


java 中的 LinkedList (双向链表)




### 跳表

#### 特点
    1. 只能用于元素有序的情况;
    2. 插入/搜索/删除复杂度都是O(log n)
    3. 空间复杂度为 O(n)，因为累加值收敛

##### 对比平衡树

###### 优势
原理简单，容易实现，方便扩展，效率更高。

###### 劣势
插入删除元素时需要同时更新索引，也是增加删除时间复杂度为 O(log n) 的原因

##### 应用
Redis, LevelDB
    
##### 实现原理
使用多级索引，通过空间换取时间的方式减少链表查询次数，查询方式类似二分查找。


#### 链接:
- [Java 源码分析（ArrayList）](http://developer.classpath.org/doc/java/util/ArrayList-source.html)
- [Linked List 的标准实现代码](https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/)
- [Linked List 示例代码](http://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/code/LinkedList.java)
- [Java 源码分析（LinkedList）](http://developer.classpath.org/doc/java/util/LinkedList-source.html)
- [LRU Cache - Linked list： LRU 缓存机制](https://leetcode-cn.com/problems/lru-cache/)
- [Redis - Skip List：跳跃表](https://redisbook.readthedocs.io/en/latest/internal-datastruct/skiplist.html) 、[为啥 Redis 使用跳表（Skip List）而不是使用 Red-Black？](https://www.zhihu.com/question/20202931)



### 栈

#### 特点
    1. 先入后出
    2. 添加、删除皆为 O(1)
    3. 查询为 O(n)
    
    
### 队列

#### 特点
    1. 先入先出
    2. 添加、删除皆为 O(1)
    3. 查询为 O(n)


### 双端队列

#### 特点
    1. 头尾都可以出入
    2. 插入和删除都是 O(1)
