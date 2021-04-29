class Node<Int>() {
    var data:Int? = null
    var next:Node<Int>?=null
    constructor(data:Int) : this() {
        this.data = data
    }

}

class LinkedLists<Int>{
    private var head:Node<Int>?= null
    var isEmpty:Boolean = head == null 
}