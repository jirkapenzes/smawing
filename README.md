# Smawing

Simple library which include something like 'MVC' for Java swing. If you will use this library than you will make Swing application faster and better. Main idea is in separate logic and design (also data of course). Library will force separate application logic from UI design. Life cycle in application is controlling by smawing library.  

## Examples

Into the Smawing repository you can find simple example of library using. 

### Counter

Counter is ease application which be able show a number. This number we can changing using two buttons - increment and decrement. First button will increase value by one and second decrease by one. 

For Smawing is necessary implement all controllers, views and models. And define main frame with configuration. Also you need defining main layout of start frame.  

Main configuration can see at code bellow. 

```Java
public class CounterMainFrame extends SFrame {

    @Override
    protected void initialize() {
    }

    @Override
    protected void registerAllModels() {
        registerModel(CounterModel.class, new CounterModel());
        registerModel(MenuModel.class, new MenuModel());
    }

    @Override
    protected void registerAllViews() {
        registerView(CounterView.class, new CounterView(this, CounterModel.class));
        registerView(MenuView.class, new MenuView(this, MenuModel.class));
    }

    @Override
    protected void registerAllControllers() {
        registerController(CounterController.class, new CounterController(this, CounterView.class, CounterModel.class));
        registerController(MenuController.class, new MenuController(this, MenuView.class, MenuModel.class));
    }

    @Override
    protected JFrame layout() {
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(getView(CounterView.class).getContentPane(), BorderLayout.CENTER);
        contentPane.add(getView(MenuView.class).getContentPane(), BorderLayout.SOUTH);
        return getFrameFactory().frame("Counter demo", contentPane);
    }
}
```

Main method of Counter application is simulary as standard swing apps. 

```Java
public class ApplicationDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CounterMainFrame mainFrame = new CounterMainFrame();
                mainFrame.show();
            }
        });
    }
}
```

Screenshot of Counter application:

![alt text](https://raw.githubusercontent.com/jirkapenzes/smawing/master/doc/counter-screenshot.png "Counter application")

