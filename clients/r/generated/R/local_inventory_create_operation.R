#' Create a new LocalInventoryCreateOperation
#'
#' @description
#' Create operation for local inventory item
#'
#' @docType class
#' @title LocalInventoryCreateOperation
#' @description LocalInventoryCreateOperation Class
#' @format An \code{R6Class} generator object
#' @field attributes  \link{RetailLocalInventoryItemAttributes}
#' @field item_id Catalog item id in the merchant namespace character
#' @field operation  character
#' @field store_code Store code for the local inventory item character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocalInventoryCreateOperation <- R6::R6Class(
  "LocalInventoryCreateOperation",
  public = list(
    `attributes` = NULL,
    `item_id` = NULL,
    `operation` = NULL,
    `store_code` = NULL,

    #' @description
    #' Initialize a new LocalInventoryCreateOperation class.
    #'
    #' @param attributes attributes
    #' @param item_id Catalog item id in the merchant namespace
    #' @param operation operation
    #' @param store_code Store code for the local inventory item
    #' @param ... Other optional arguments.
    initialize = function(`attributes`, `item_id`, `operation`, `store_code`, ...) {
      if (!missing(`attributes`)) {
        stopifnot(R6::is.R6(`attributes`))
        self$`attributes` <- `attributes`
      }
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("CREATE"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
      if (!missing(`store_code`)) {
        if (!(is.character(`store_code`) && length(`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", `store_code`))
        }
        self$`store_code` <- `store_code`
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
    #' @return LocalInventoryCreateOperation as a base R list.
    #' @examples
    #' # convert array of LocalInventoryCreateOperation (x) to a data frame
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
    #' Convert LocalInventoryCreateOperation to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocalInventoryCreateOperationObject <- list()
      if (!is.null(self$`attributes`)) {
        LocalInventoryCreateOperationObject[["attributes"]] <-
          self$extractSimpleType(self$`attributes`)
      }
      if (!is.null(self$`item_id`)) {
        LocalInventoryCreateOperationObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`operation`)) {
        LocalInventoryCreateOperationObject[["operation"]] <-
          self$`operation`
      }
      if (!is.null(self$`store_code`)) {
        LocalInventoryCreateOperationObject[["store_code"]] <-
          self$`store_code`
      }
      return(LocalInventoryCreateOperationObject)
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
    #' Deserialize JSON string into an instance of LocalInventoryCreateOperation
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalInventoryCreateOperation
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`attributes`)) {
        `attributes_object` <- RetailLocalInventoryItemAttributes$new()
        `attributes_object`$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
        self$`attributes` <- `attributes_object`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      if (!is.null(this_object$`store_code`)) {
        self$`store_code` <- this_object$`store_code`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocalInventoryCreateOperation in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocalInventoryCreateOperation
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalInventoryCreateOperation
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`attributes` <- RetailLocalInventoryItemAttributes$new()$fromJSON(jsonlite::toJSON(this_object$`attributes`, auto_unbox = TRUE, digits = NA))
      self$`item_id` <- this_object$`item_id`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self$`store_code` <- this_object$`store_code`
      self
    },

    #' @description
    #' Validate JSON input with respect to LocalInventoryCreateOperation and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `attributes`
      if (!is.null(input_json$`attributes`)) {
        stopifnot(R6::is.R6(input_json$`attributes`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryCreateOperation: the required field `attributes` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryCreateOperation: the required field `item_id` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryCreateOperation: the required field `operation` is missing."))
      }
      # check the required field `store_code`
      if (!is.null(input_json$`store_code`)) {
        if (!(is.character(input_json$`store_code`) && length(input_json$`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", input_json$`store_code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalInventoryCreateOperation: the required field `store_code` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocalInventoryCreateOperation
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        return(FALSE)
      }

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        return(FALSE)
      }

      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
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
      # check if the required `attributes` is null
      if (is.null(self$`attributes`)) {
        invalid_fields["attributes"] <- "Non-nullable required field `attributes` cannot be null."
      }

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
      }

      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
        invalid_fields["store_code"] <- "Non-nullable required field `store_code` cannot be null."
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
# LocalInventoryCreateOperation$unlock()
#
## Below is an example to define the print function
# LocalInventoryCreateOperation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocalInventoryCreateOperation$lock()

