/* 
 * Copyright 1999-2004 The Apache Software Foundation
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.log.test;

import java.util.ArrayList;
import java.util.List;
import org.apache.log.Logger;
import org.apache.log.util.LoggerListener;

/**
 * A logger listener that records the log messages it receives.
 *
 * @author Peter Donald
 * @version $Revision: 1.6 $ $Date: 2004/02/28 11:31:24 $
 */
class RecordingLoggerListener
    extends LoggerListener
{
    //The listeners that have been created
    private final List m_loggers = new ArrayList();

    public void loggerCreated( final String category,
                               final Logger logger )
    {
        m_loggers.add( logger );
    }

    public Logger[] getLoggers()
    {
        return (Logger[])m_loggers.toArray( new Logger[ m_loggers.size() ] );
    }
}

