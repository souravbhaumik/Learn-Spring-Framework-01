<table>
    <tr>
        <th>Heading</th>
        <th>Eager Initialization</th>
        <th>Lazy Initialization</th>
    </tr>
    <tr>
        <td>Initialization time</td>
        <td>Bean initialized at the startup of the application.</td>
        <td>Bean initialized when it is first made use of in the application.</td>
    </tr>
    <tr>
        <td>Default</td>
        <td>Default</td>
        <td>Not default</td>
    </tr>
    <tr>
        <td>Code snippet</td>
        <td>@Lazy(value=false) or Absence of @Lazy annotation</td>
        <td>@Lazy or @Lazy(value=true)</td>
    </tr>
    <tr>
        <td>What happens if there are errors in initializing?</td>
        <td>errors will prevent application from starting up</td>
        <td>Errors will result in runtime exceptions</td>
    </tr>
    <tr>
        <td>Usage</td>
        <td>Very frequently used</td>
        <td>Rarely used</td>
    </tr>
    <tr>
        <td>Memory consumption</td>
        <td>More(All beans are initialized at startup)</td>
        <td>Less(Until bean is initialized)</td>
    </tr>
    <tr>
        <td>Recommended Scenario</td>
        <td>Most of the beans.</td>
        <td>Beans are rarely used in the app</td>
    </tr>
</table>