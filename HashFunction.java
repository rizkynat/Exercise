package algorithm;
import java.util.Arrays;
public class HashFunction<T> {
    
    Entry[] arrayHash;//array of object
    int size;
    public HashFunction(int size){
        this.size=size;
        arrayHash = new Entry[size];
        for(int i=0;i<size;i++)
            arrayHash[i]=new Entry();
        
    }
    
    int getHash(int key){
        return key%size;
    }
    
    public void put(int key, Object value){
        int HashIndex = getHash(key);
        Entry ArrayValue = arrayHash[HashIndex];
        Entry newItem = new Entry(key, value);
        newItem.next = ArrayValue.next;
        ArrayValue.next = newItem;
    }
    
    public T get(int key){
        T value = null;
        int HashIndex = getHash(key);
        Entry ArrayValue = arrayHash[HashIndex];//lookup index
        while(ArrayValue!=null){
            if(ArrayValue.getKey()==key){
                value = (T) ArrayValue.getValue();
                break;
            }
            ArrayValue=ArrayValue.next;
        }
        return value;
    }
    
    public static void main(String[] args) {
       HashFunction<String> h = new HashFunction<String>(10);
       h.put(11,"Rizky");
       h.put(4, "Anna");
       h.put(21, "Ola");
        System.out.println(h.get(11)+":"+h.getHash(11));
       
    }
    
}
