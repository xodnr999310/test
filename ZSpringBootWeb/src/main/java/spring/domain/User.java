package spring.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * FileName : User.java  
 * �� User �� ������ ���� Value Object (�����ΰ�ü,�����Ͻ���ü)
 * �� USERS TABLE �� 1���� ROW �� ������ ���´�.  
*/ 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class User implements Serializable {

	///Field
    private String userId; 			// ȸ�� ID 
    private String userName;		// ȸ�� �̸� 
    private String password;     // ��й�ȣ 
    private Integer age;    			// ���� :: Integer wrapper class ��� :: ���� �뵵 Ȯ��  
    private int grade;    				// ��� :: int primitive ��� :: :: ���� �뵵 Ȯ�� 
    private Timestamp regDate	; // �������� 
    //private Timestamp regDate	= new Timestamp(new Date().getTime()); // ��������
    private boolean active; 
   
}//end of class