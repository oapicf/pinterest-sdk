#' Create a new ConversionEventsDataItemsCustomDataContentsItems
#'
#' @description
#' ConversionEventsDataItemsCustomDataContentsItems Class
#'
#' @docType class
#' @title ConversionEventsDataItemsCustomDataContentsItems
#' @description ConversionEventsDataItemsCustomDataContentsItems Class
#' @format An \code{R6Class} generator object
#' @field id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). character [optional]
#' @field item_brand The brand of a product. character [optional]
#' @field item_brand_id The brand ID of a product. character [optional]
#' @field item_category The category of a product. character [optional]
#' @field item_name The name of a product. character [optional]
#' @field item_price The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). character [optional]
#' @field quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ConversionEventsDataItemsCustomDataContentsItems <- R6::R6Class(
  "ConversionEventsDataItemsCustomDataContentsItems",
  public = list(
    `id` = NULL,
    `item_brand` = NULL,
    `item_brand_id` = NULL,
    `item_category` = NULL,
    `item_name` = NULL,
    `item_price` = NULL,
    `quantity` = NULL,

    #' @description
    #' Initialize a new ConversionEventsDataItemsCustomDataContentsItems class.
    #'
    #' @param id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
    #' @param item_brand The brand of a product.
    #' @param item_brand_id The brand ID of a product.
    #' @param item_category The category of a product.
    #' @param item_name The name of a product.
    #' @param item_price The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
    #' @param quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `item_brand` = NULL, `item_brand_id` = NULL, `item_category` = NULL, `item_name` = NULL, `item_price` = NULL, `quantity` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`item_brand`)) {
        if (!(is.character(`item_brand`) && length(`item_brand`) == 1)) {
          stop(paste("Error! Invalid data for `item_brand`. Must be a string:", `item_brand`))
        }
        self$`item_brand` <- `item_brand`
      }
      if (!is.null(`item_brand_id`)) {
        if (!(is.character(`item_brand_id`) && length(`item_brand_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_brand_id`. Must be a string:", `item_brand_id`))
        }
        self$`item_brand_id` <- `item_brand_id`
      }
      if (!is.null(`item_category`)) {
        if (!(is.character(`item_category`) && length(`item_category`) == 1)) {
          stop(paste("Error! Invalid data for `item_category`. Must be a string:", `item_category`))
        }
        self$`item_category` <- `item_category`
      }
      if (!is.null(`item_name`)) {
        if (!(is.character(`item_name`) && length(`item_name`) == 1)) {
          stop(paste("Error! Invalid data for `item_name`. Must be a string:", `item_name`))
        }
        self$`item_name` <- `item_name`
      }
      if (!is.null(`item_price`)) {
        if (!(is.character(`item_price`) && length(`item_price`) == 1)) {
          stop(paste("Error! Invalid data for `item_price`. Must be a string:", `item_price`))
        }
        self$`item_price` <- `item_price`
      }
      if (!is.null(`quantity`)) {
        if (!(is.numeric(`quantity`) && length(`quantity`) == 1)) {
          stop(paste("Error! Invalid data for `quantity`. Must be an integer:", `quantity`))
        }
        self$`quantity` <- `quantity`
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
    #' @return ConversionEventsDataItemsCustomDataContentsItems as a base R list.
    #' @examples
    #' # convert array of ConversionEventsDataItemsCustomDataContentsItems (x) to a data frame
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
    #' Convert ConversionEventsDataItemsCustomDataContentsItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ConversionEventsDataItemsCustomDataContentsItemsObject <- list()
      if (!is.null(self$`id`)) {
        ConversionEventsDataItemsCustomDataContentsItemsObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`item_brand`)) {
        ConversionEventsDataItemsCustomDataContentsItemsObject[["item_brand"]] <-
          self$`item_brand`
      }
      if (!is.null(self$`item_brand_id`)) {
        ConversionEventsDataItemsCustomDataContentsItemsObject[["item_brand_id"]] <-
          self$`item_brand_id`
      }
      if (!is.null(self$`item_category`)) {
        ConversionEventsDataItemsCustomDataContentsItemsObject[["item_category"]] <-
          self$`item_category`
      }
      if (!is.null(self$`item_name`)) {
        ConversionEventsDataItemsCustomDataContentsItemsObject[["item_name"]] <-
          self$`item_name`
      }
      if (!is.null(self$`item_price`)) {
        ConversionEventsDataItemsCustomDataContentsItemsObject[["item_price"]] <-
          self$`item_price`
      }
      if (!is.null(self$`quantity`)) {
        ConversionEventsDataItemsCustomDataContentsItemsObject[["quantity"]] <-
          self$`quantity`
      }
      return(ConversionEventsDataItemsCustomDataContentsItemsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataItemsCustomDataContentsItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataItemsCustomDataContentsItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`item_brand`)) {
        self$`item_brand` <- this_object$`item_brand`
      }
      if (!is.null(this_object$`item_brand_id`)) {
        self$`item_brand_id` <- this_object$`item_brand_id`
      }
      if (!is.null(this_object$`item_category`)) {
        self$`item_category` <- this_object$`item_category`
      }
      if (!is.null(this_object$`item_name`)) {
        self$`item_name` <- this_object$`item_name`
      }
      if (!is.null(this_object$`item_price`)) {
        self$`item_price` <- this_object$`item_price`
      }
      if (!is.null(this_object$`quantity`)) {
        self$`quantity` <- this_object$`quantity`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ConversionEventsDataItemsCustomDataContentsItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ConversionEventsDataItemsCustomDataContentsItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of ConversionEventsDataItemsCustomDataContentsItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`item_brand` <- this_object$`item_brand`
      self$`item_brand_id` <- this_object$`item_brand_id`
      self$`item_category` <- this_object$`item_category`
      self$`item_name` <- this_object$`item_name`
      self$`item_price` <- this_object$`item_price`
      self$`quantity` <- this_object$`quantity`
      self
    },

    #' @description
    #' Validate JSON input with respect to ConversionEventsDataItemsCustomDataContentsItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ConversionEventsDataItemsCustomDataContentsItems
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`item_brand_id`) > 64) {
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
      if (nchar(self$`item_brand_id`) > 64) {
        invalid_fields["item_brand_id"] <- "Invalid length for `item_brand_id`, must be smaller than or equal to 64."
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
# ConversionEventsDataItemsCustomDataContentsItems$unlock()
#
## Below is an example to define the print function
# ConversionEventsDataItemsCustomDataContentsItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ConversionEventsDataItemsCustomDataContentsItems$lock()

