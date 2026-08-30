#' Create a new LocalInventoryItemResponse
#'
#' @description
#' Local inventory item response
#'
#' @docType class
#' @title LocalInventoryItemResponse
#' @description LocalInventoryItemResponse Class
#' @format An \code{R6Class} generator object
#' @field ad_link Ad link for the item character [optional]
#' @field availability Availability status of the item \link{ItemAvailability} [optional]
#' @field created_at The millisecond timestamp when the local inventory item was created integer
#' @field item_id The catalog item id in the merchant namespace character
#' @field last_updated_time The millisecond timestamp when the local inventory item was lastly modified by the merchant. integer
#' @field price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. character [optional]
#' @field sale_price The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. character [optional]
#' @field store_metadata Store metadata for this local inventory item \link{StoreMetadata}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocalInventoryItemResponse <- R6::R6Class(
  "LocalInventoryItemResponse",
  public = list(
    `ad_link` = NULL,
    `availability` = NULL,
    `created_at` = NULL,
    `item_id` = NULL,
    `last_updated_time` = NULL,
    `price` = NULL,
    `sale_price` = NULL,
    `store_metadata` = NULL,

    #' @description
    #' Initialize a new LocalInventoryItemResponse class.
    #'
    #' @param created_at The millisecond timestamp when the local inventory item was created
    #' @param item_id The catalog item id in the merchant namespace
    #' @param last_updated_time The millisecond timestamp when the local inventory item was lastly modified by the merchant.
    #' @param store_metadata Store metadata for this local inventory item
    #' @param ad_link Ad link for the item
    #' @param availability Availability status of the item
    #' @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
    #' @param sale_price The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
    #' @param ... Other optional arguments.
    initialize = function(`created_at`, `item_id`, `last_updated_time`, `store_metadata`, `ad_link` = NULL, `availability` = NULL, `price` = NULL, `sale_price` = NULL, ...) {
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`last_updated_time`)) {
        if (!(is.numeric(`last_updated_time`) && length(`last_updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `last_updated_time`. Must be an integer:", `last_updated_time`))
        }
        self$`last_updated_time` <- `last_updated_time`
      }
      if (!missing(`store_metadata`)) {
        stopifnot(R6::is.R6(`store_metadata`))
        self$`store_metadata` <- `store_metadata`
      }
      if (!is.null(`ad_link`)) {
        if (!(is.character(`ad_link`) && length(`ad_link`) == 1)) {
          stop(paste("Error! Invalid data for `ad_link`. Must be a string:", `ad_link`))
        }
        self$`ad_link` <- `ad_link`
      }
      if (!is.null(`availability`)) {
        if (!(`availability` %in% c())) {
          stop(paste("Error! \"", `availability`, "\" cannot be assigned to `availability`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`availability`))
        self$`availability` <- `availability`
      }
      if (!is.null(`price`)) {
        if (!(is.character(`price`) && length(`price`) == 1)) {
          stop(paste("Error! Invalid data for `price`. Must be a string:", `price`))
        }
        self$`price` <- `price`
      }
      if (!is.null(`sale_price`)) {
        if (!(is.character(`sale_price`) && length(`sale_price`) == 1)) {
          stop(paste("Error! Invalid data for `sale_price`. Must be a string:", `sale_price`))
        }
        self$`sale_price` <- `sale_price`
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
    #' @return LocalInventoryItemResponse as a base R list.
    #' @examples
    #' # convert array of LocalInventoryItemResponse (x) to a data frame
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
    #' Convert LocalInventoryItemResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocalInventoryItemResponseObject <- list()
      if (!is.null(self$`ad_link`)) {
        LocalInventoryItemResponseObject[["ad_link"]] <-
          self$`ad_link`
      }
      if (!is.null(self$`availability`)) {
        LocalInventoryItemResponseObject[["availability"]] <-
          self$extractSimpleType(self$`availability`)
      }
      if (!is.null(self$`created_at`)) {
        LocalInventoryItemResponseObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`item_id`)) {
        LocalInventoryItemResponseObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`last_updated_time`)) {
        LocalInventoryItemResponseObject[["last_updated_time"]] <-
          self$`last_updated_time`
      }
      if (!is.null(self$`price`)) {
        LocalInventoryItemResponseObject[["price"]] <-
          self$`price`
      }
      if (!is.null(self$`sale_price`)) {
        LocalInventoryItemResponseObject[["sale_price"]] <-
          self$`sale_price`
      }
      if (!is.null(self$`store_metadata`)) {
        LocalInventoryItemResponseObject[["store_metadata"]] <-
          self$extractSimpleType(self$`store_metadata`)
      }
      return(LocalInventoryItemResponseObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of LocalInventoryItemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalInventoryItemResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_link`)) {
        self$`ad_link` <- this_object$`ad_link`
      }
      if (!is.null(this_object$`availability`)) {
        `availability_object` <- ItemAvailability$new()
        `availability_object`$fromJSON(jsonlite::toJSON(this_object$`availability`, auto_unbox = TRUE, digits = NA))
        self$`availability` <- `availability_object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`last_updated_time`)) {
        self$`last_updated_time` <- this_object$`last_updated_time`
      }
      if (!is.null(this_object$`price`)) {
        self$`price` <- this_object$`price`
      }
      if (!is.null(this_object$`sale_price`)) {
        self$`sale_price` <- this_object$`sale_price`
      }
      if (!is.null(this_object$`store_metadata`)) {
        `store_metadata_object` <- StoreMetadata$new()
        `store_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`store_metadata`, auto_unbox = TRUE, digits = NA))
        self$`store_metadata` <- `store_metadata_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocalInventoryItemResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocalInventoryItemResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalInventoryItemResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_link` <- this_object$`ad_link`
      self$`availability` <- ItemAvailability$new()$fromJSON(jsonlite::toJSON(this_object$`availability`, auto_unbox = TRUE, digits = NA))
      self$`created_at` <- this_object$`created_at`
      self$`item_id` <- this_object$`item_id`
      self$`last_updated_time` <- this_object$`last_updated_time`
      self$`price` <- this_object$`price`
      self$`sale_price` <- this_object$`sale_price`
      self$`store_metadata` <- StoreMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`store_metadata`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to LocalInventoryItemResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryItemResponse: the required field `created_at` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryItemResponse: the required field `item_id` is missing."))
      }
      # check the required field `last_updated_time`
      if (!is.null(input_json$`last_updated_time`)) {
        if (!(is.numeric(input_json$`last_updated_time`) && length(input_json$`last_updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `last_updated_time`. Must be an integer:", input_json$`last_updated_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryItemResponse: the required field `last_updated_time` is missing."))
      }
      # check the required field `store_metadata`
      if (!is.null(input_json$`store_metadata`)) {
        stopifnot(R6::is.R6(input_json$`store_metadata`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryItemResponse: the required field `store_metadata` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocalInventoryItemResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `last_updated_time` is null
      if (is.null(self$`last_updated_time`)) {
        return(FALSE)
      }

      # check if the required `store_metadata` is null
      if (is.null(self$`store_metadata`)) {
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
      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `last_updated_time` is null
      if (is.null(self$`last_updated_time`)) {
        invalid_fields["last_updated_time"] <- "Non-nullable required field `last_updated_time` cannot be null."
      }

      # check if the required `store_metadata` is null
      if (is.null(self$`store_metadata`)) {
        invalid_fields["store_metadata"] <- "Non-nullable required field `store_metadata` cannot be null."
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
# LocalInventoryItemResponse$unlock()
#
## Below is an example to define the print function
# LocalInventoryItemResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocalInventoryItemResponse$lock()

