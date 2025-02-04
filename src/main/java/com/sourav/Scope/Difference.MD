<table>
    <tr>
        <th>Heading</th>
        <th>Prototype</th>
        <th>Singleton</th>
    </tr>
    <tr>
        <td>Instances</td>
        <td>Possibly many as per Spring IOC container.</td>
        <td>One per Spring IOC container.</td>
    </tr>
    <tr>
        <td>Beans</td>
        <td>New bean instance created every time the bean is referred to.</td>
        <td>Same bean instance reused.</td>
    </tr>
    <tr>
        <td>Code snippet</td>
        <td>@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)</td>
        <td>@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)</td>
    </tr>
    <tr>
        <td>What happens if there are errors in initializing?</td>
        <td>errors will prevent application from starting up</td>
        <td>Errors will result in runtime exceptions</td>
    </tr>
    <tr>
        <td>Usage</td>
        <td>Rarely used</td>
        <td>Very frequently used</td>
    </tr>
    <tr>
        <td>Recommended Scenario</td>
        <td>Stateful Beans</td>
        <td>Stateless Beans</td>
    </tr>
</table>