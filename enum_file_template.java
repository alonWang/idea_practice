#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

public enum ${NAME} {
    ;
	private int value;
	${NAME}(int value) {
		this.value = value;
	}
	public int value() {
		return this.value;
	}
}
