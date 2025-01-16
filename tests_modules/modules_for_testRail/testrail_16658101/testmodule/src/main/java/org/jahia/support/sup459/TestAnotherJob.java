/*
 * ==========================================================================================
 * =                            JAHIA'S ENTERPRISE DISTRIBUTION                             =
 * ==========================================================================================
 *
 *                                  http://www.jahia.com
 *
 * JAHIA'S ENTERPRISE DISTRIBUTIONS LICENSING - IMPORTANT INFORMATION
 * ==========================================================================================
 *
 *     Copyright (C) 2002-2024 Jahia Solutions Group. All rights reserved.
 *
 *     This file is part of a Jahia's Enterprise Distribution.
 *
 *     Jahia's Enterprise Distributions must be used in accordance with the terms
 *     contained in the Jahia Solutions Group Terms &amp; Conditions as well as
 *     the Jahia Sustainable Enterprise License (JSEL).
 *
 *     For questions regarding licensing, support, production usage...
 *     please contact our team at sales@jahia.com or go to http://www.jahia.com/license.
 *
 * ==========================================================================================
 */
package org.jahia.support.sup459;

import org.jahia.services.scheduler.BackgroundJob;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jerome Blanchard
 */
public class TestAnotherJob extends BackgroundJob {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestAnotherJob.class);

    public TestAnotherJob() {
    }

    @Override
    public void executeJahiaJob(JobExecutionContext jobExecutionContext) throws Exception {
        LOGGER.info("Starting TestAnotherJob execution {}", jobExecutionContext.getJobDetail().toString());
        LOGGER.info("JobDetail group={}", jobExecutionContext.getJobDetail().getGroup());
        LOGGER.info("JobDetail name={}", jobExecutionContext.getJobDetail().getName());
        LOGGER.info("JobDetail key={}", jobExecutionContext.getJobDetail().getKey());
        LOGGER.info("JobDetail description={}", jobExecutionContext.getJobDetail().getDescription());
        String foo = jobExecutionContext.getMergedJobDataMap().getString("foo");
        LOGGER.info("Retrieve job data foo={}", foo);
        int sleep = jobExecutionContext.getJobDetail().getJobDataMap().getIntFromString("sleep");
        LOGGER.info("Using configured sleep time of {}ms", sleep);
        Thread.sleep(sleep);
        LOGGER.info("Sleep done");
    }
}
