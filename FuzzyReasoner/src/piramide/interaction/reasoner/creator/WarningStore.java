/*
 * Copyright (C) 2010 PIRAmIDE-SP3 authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * This software consists of contributions made by many individuals, 
 * listed below:
 *
 * Author: Aitor Almeida <aitor.almeida@deusto.es>
 *         Pablo Orduña <pablo.orduna@deusto.es>
 *         Eduardo Castillejo <eduardo.castillejo@deusto.es>
 *
 */
package piramide.interaction.reasoner.creator;

import java.io.PrintStream;
import java.util.List;
import java.util.Vector;

public class WarningStore {
	private final List<String> messages = new Vector<String>();
	
	public void clear(){
		this.messages.clear();
	}
	
	public void add(String message){
		this.messages.add(message);
	}
	
	public void print(){
		print(System.err);
	}
	
	public void print(PrintStream ps){
		for(String message : this.messages){
			ps.println(message);
		}
	}
	
	public String [] getMessages(){
		return this.messages.toArray(new String[]{});
	}
}