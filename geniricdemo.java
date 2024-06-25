package democonnection;

//<> is generice sign

public class geniricdemo <T,K>{
		T data;
		K data1;
		public K getData1() {
			return data1;
		}

		public void setData1(K data1) {
			this.data1 = data1;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "geniricdemo [data=" + data + ", data1=" + data1 + "]";
		}

		
		
}
