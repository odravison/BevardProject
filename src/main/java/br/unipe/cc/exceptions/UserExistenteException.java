/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.exceptions;

/**
 *
 * @author Felipe
 */
public class UserExistenteException extends Exception {
	
	public UserExistenteException(String msg){
		super(msg);
	}

}