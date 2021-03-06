package io.github.asw.i3a.operators.service.services;

import java.util.List;

import io.github.asw.i3a.operators.service.types.Operator;

public interface OperatorsService {

	/**
	 * Given the data of a user, checks if there's such an user, and if the
	 * password matches
	 * 
	 * @param identifier The login email for the user
	 * @param password The password given on the credentials
	 * @return Either the proper user, if the user exists and the password
	 *         matches. Null otherwise
	 */
	String auth( String email, String password );

	List<Operator> findAll();

	Operator findById( String id );

}
