package org.jbpm.task.service.test.spring;

import static org.jbpm.task.service.base.async.TaskServiceBaseUserGroupCallbackAsyncTest.*;
import org.junit.Ignore;

import org.junit.Test;
public class TaskServiceBaseUserGroupCallbackSpringTest extends BaseSpringNoUserGroupSetupTest {
    
    @Test
    public void testTasksOwnedQueryWithI18N() { 
        runTestTasksOwnedQueryWithI18N(client, users, groups);
    }

    @Test
    public void testPotentialOwnerQueries() { 
        runTestPotentialOwnerQueries(client, users, groups);
    }

    @Test
    public void testPeopleAssignmentQueries() { 
        runTestPeopleAssignmentQueries(client, users, groups, taskSession);
    }

}
