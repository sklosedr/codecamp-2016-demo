import { Codecamp2016DemoFrontendWebappPage } from './app.po';

describe('codecamp-2016-demo-frontend-webapp App', function() {
  let page: Codecamp2016DemoFrontendWebappPage;

  beforeEach(() => {
    page = new Codecamp2016DemoFrontendWebappPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
