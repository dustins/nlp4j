/**
 * Copyright 2015, Emory University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.mathcs.nlp.corenlp.pos.feature;

import edu.emory.mathcs.nlp.corenlp.component.feature.FeatureItem;
import edu.emory.mathcs.nlp.corenlp.component.feature.Field;
import edu.emory.mathcs.nlp.corenlp.pos.POSFeatureTemplate;

/**
 * Minimum features.
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class POSFeatureTemplate2 extends POSFeatureTemplate
{
	private static final long serialVersionUID = 8265193521014290387L;

	@Override
	protected void init()
	{
		// 1-gram features 
		add(new FeatureItem<>(-2, Field.word_form));
		add(new FeatureItem<>(-1, Field.word_form));
		add(new FeatureItem<>( 0, Field.word_form));
		add(new FeatureItem<>( 1, Field.word_form));
		add(new FeatureItem<>( 2, Field.word_form));

		add(new FeatureItem<>(-2, Field.pos_tag));
		add(new FeatureItem<>(-1, Field.pos_tag));
	}
}
