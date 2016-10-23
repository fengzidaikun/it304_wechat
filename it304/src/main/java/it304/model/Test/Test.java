package it304.model.Test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ����Ϊmysql�в��Ա�Ĳ����࣬�������Ժ�˵���á���ʵ������
 * @author DK
 *
 */
@Entity
@Table(name ="test")
public class Test {
	@Id  //��ע���������һ��������
	@GeneratedValue(strategy=GenerationType.AUTO)  // ��ʾ�������ݿ��Զ�����
	private Long id;
	//ע�� ������������ݿ���һֱ���ɲ���˵���������һ�� ��ʹ��@Column(name ="xxx")
	//@JoinColumn��@Column��������ǣ�@JoinColumnע�͵��Ǳ�������֮���ϵ���ֶΣ���Ҫ��ע��ʵ�������ϡ�
	//��@Column��ע���Ǳ��в��������ϵ���ֶΡ�
	private String name;
	private String passWord;
	//��Ϊÿһ��ʵ�������ɿյĹ��캯��
	public Test() {
		super();
	}

	public Test(Long id, String name, String passWord) {
		super();
		this.id = id;
		this.name = name;
		this.passWord = passWord;
	}
	
	
	
}
