package jpaHelper.exceptions;

import jpaHelper.exceptions.enums.ErrorEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JpaHelperException extends Exception {

	ErrorEnum msj;
	String errorEx;
	
	
	public JpaHelperException( String _errorEx , ErrorEnum _msj) {
		super();
		this.msj = _msj;
		this.errorEx = _errorEx;
	}


	public ErrorEnum getMsj() {
		return msj;
	}


	public void setMsj(ErrorEnum msj) {
		this.msj = msj;
	}

	
	
	
	
	
	
}
