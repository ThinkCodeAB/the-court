package se.thinkcode;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;
import java.util.Map;

public class OrderTransformer implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(
                Order.class,
                (Map<String, String> row) -> {
                    String name = row.get("name");
                    int price = Integer.parseInt(row.get("price"));
                    return new Order(name, price);
                }
        ));
    }
}
