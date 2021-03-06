package com.epam.module9.steps;

import com.epam.module9.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class DeleteExistingRepositoryStep extends BaseStep{
    private HomePage homePage;

    public DeleteExistingRepositoryStep(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    public DeleteExistingRepositoryStep deleteRepository(){
        homePage = homePage.signIn()
                           .openYourProfile()
                           .clickRepositoryLink()
                           .chooseRepository(REPOSITORY_NAME)
                           .deleteRepository(REPOSITORY_NAME);
        return this;
    }

    public boolean repositoryIsDeleted(){
        return homePage.getTitleAfterDeleting().equals(TITLE_AFTER_DELETING);
    }
}

