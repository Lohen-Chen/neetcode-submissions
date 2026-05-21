class DynamicArray {
    private int size;
    private int capacity; 
    private int[] arr;
    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size==capacity){
            resize();
        }

        arr[size]=n;
        size++;
    }

    public int popback() {
        int value = arr[size-1];
        size--;
        return value; 
    }

    private void resize() {
        int[] newArray = new int[capacity * 2];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
        capacity=capacity*2; 
    }

    public int getSize() {
        return size; 
    }

    public int getCapacity() {
        return capacity;
    }
}
