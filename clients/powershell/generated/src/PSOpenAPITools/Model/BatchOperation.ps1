#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.12.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum BatchOperation.

.DESCRIPTION

The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to ""Out of Stock"".
#>

enum BatchOperation {
    # enum value: "UPDATE"
    UPDATE
    # enum value: "UPSERT"
    UPSERT
    # enum value: "CREATE"
    CREATE
    # enum value: "DELETE_DISCONTINUED"
    DELETE_DISCONTINUED
    # enum value: "DELETE"
    DELETE
}
