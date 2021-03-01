/**
 * 
 */
package com.ahh.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author adria
 *
 */

@Service
@Profile("dev")
public class DevEnvironment implements EnvironmentService{

	@Override
	public String getEnvironment() {
		return "Dev";
	}

}
