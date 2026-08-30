#' Create a new CatalogsRetailReportAllItemsFilter
#'
#' @description
#' ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
#'
#' @docType class
#' @title CatalogsRetailReportAllItemsFilter
#' @description CatalogsRetailReportAllItemsFilter Class
#' @format An \code{R6Class} generator object
#' @field catalog_id Unique identifier of a catalog. If not given, oldest catalog will be used character [optional]
#' @field product_group_id Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. character [optional]
#' @field report_type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailReportAllItemsFilter <- R6::R6Class(
  "CatalogsRetailReportAllItemsFilter",
  public = list(
    `catalog_id` = NULL,
    `product_group_id` = NULL,
    `report_type` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailReportAllItemsFilter class.
    #'
    #' @param report_type report_type
    #' @param catalog_id Unique identifier of a catalog. If not given, oldest catalog will be used
    #' @param product_group_id Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
    #' @param ... Other optional arguments.
    initialize = function(`report_type`, `catalog_id` = NULL, `product_group_id` = NULL, ...) {
      if (!missing(`report_type`)) {
        if (!(`report_type` %in% c("ALL_ITEMS"))) {
          stop(paste("Error! \"", `report_type`, "\" cannot be assigned to `report_type`. Must be \"ALL_ITEMS\".", sep = ""))
        }
        if (!(is.character(`report_type`) && length(`report_type`) == 1)) {
          stop(paste("Error! Invalid data for `report_type`. Must be a string:", `report_type`))
        }
        self$`report_type` <- `report_type`
      }
      if (!is.null(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
      if (!is.null(`product_group_id`)) {
        if (!(is.character(`product_group_id`) && length(`product_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `product_group_id`. Must be a string:", `product_group_id`))
        }
        self$`product_group_id` <- `product_group_id`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CatalogsRetailReportAllItemsFilter as a base R list.
    #' @examples
    #' # convert array of CatalogsRetailReportAllItemsFilter (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CatalogsRetailReportAllItemsFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsRetailReportAllItemsFilterObject <- list()
      if (!is.null(self$`catalog_id`)) {
        CatalogsRetailReportAllItemsFilterObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`product_group_id`)) {
        CatalogsRetailReportAllItemsFilterObject[["product_group_id"]] <-
          self$`product_group_id`
      }
      if (!is.null(self$`report_type`)) {
        CatalogsRetailReportAllItemsFilterObject[["report_type"]] <-
          self$`report_type`
      }
      return(CatalogsRetailReportAllItemsFilterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailReportAllItemsFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailReportAllItemsFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      if (!is.null(this_object$`product_group_id`)) {
        self$`product_group_id` <- this_object$`product_group_id`
      }
      if (!is.null(this_object$`report_type`)) {
        if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("ALL_ITEMS"))) {
          stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"ALL_ITEMS\".", sep = ""))
        }
        self$`report_type` <- this_object$`report_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsRetailReportAllItemsFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailReportAllItemsFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailReportAllItemsFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_id` <- this_object$`catalog_id`
      self$`product_group_id` <- this_object$`product_group_id`
      if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("ALL_ITEMS"))) {
        stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"ALL_ITEMS\".", sep = ""))
      }
      self$`report_type` <- this_object$`report_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailReportAllItemsFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `report_type`
      if (!is.null(input_json$`report_type`)) {
        if (!(is.character(input_json$`report_type`) && length(input_json$`report_type`) == 1)) {
          stop(paste("Error! Invalid data for `report_type`. Must be a string:", input_json$`report_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailReportAllItemsFilter: the required field `report_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailReportAllItemsFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`product_group_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `report_type` is null
      if (is.null(self$`report_type`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`product_group_id`, "^\\d+$")) {
        invalid_fields["product_group_id"] <- "Invalid value for `product_group_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `report_type` is null
      if (is.null(self$`report_type`)) {
        invalid_fields["report_type"] <- "Non-nullable required field `report_type` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsRetailReportAllItemsFilter$unlock()
#
## Below is an example to define the print function
# CatalogsRetailReportAllItemsFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailReportAllItemsFilter$lock()

