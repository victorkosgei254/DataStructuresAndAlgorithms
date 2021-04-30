class Node<Int>(data: Int) {
    var data:Int? = data
    var next:Node<Int>?=null
    var previous:Node<Int>?=null
}

class LinkedLists<Int>{
    private var head:Node<Int>?= null
    var isEmpty:Boolean = head == null

    fun first():Node<Int>? = head


    fun last():Node<Int>?{
        var node = head
        if(node != null){
            while (node?.next != null) node = node?.next
            return node
        }else   return null
    }


    fun add( data:Int){
        var newNode  = Node(data)
        var lastNode = last()
        if (lastNode != null){
            newNode.previous = lastNode
            lastNode.next = newNode
        }else head=newNode


    }

    fun count(): kotlin.Int {
        var node = head
        if(node!=null){
            var counter = 1
            while(node?.next != null){
                node=node?.next //increment to the next node
                counter += 1
            }
            return counter
        }else return 0
    }
}