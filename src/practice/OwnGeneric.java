package practice;

public class OwnGeneric<K, V> implements IGeneric<K,V> {

	private K ID;
	private V AccoutNumber;
	
	public OwnGeneric(K ID, V acc)
	{
		this.ID =ID;
		this.AccoutNumber = acc;
	}

	@Override
	public K getID() {
		return this.ID;
	}

	@Override
	public V getAcc() {
		return this.AccoutNumber;
	}
}
