#' Create a new StoreMetadata
#'
#' @description
#' Store metadata for a specific store location
#'
#' @docType class
#' @title StoreMetadata
#' @description StoreMetadata Class
#' @format An \code{R6Class} generator object
#' @field geohash Geohash of the store location character [optional]
#' @field latitude Geographic latitude coordinate of the store numeric [optional]
#' @field longitude Geographic longitude coordinate of the store numeric [optional]
#' @field store_code Merchant provided store code character
#' @field store_id Internal store code character
#' @field store_name Store name character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
StoreMetadata <- R6::R6Class(
  "StoreMetadata",
  public = list(
    `geohash` = NULL,
    `latitude` = NULL,
    `longitude` = NULL,
    `store_code` = NULL,
    `store_id` = NULL,
    `store_name` = NULL,

    #' @description
    #' Initialize a new StoreMetadata class.
    #'
    #' @param store_code Merchant provided store code
    #' @param store_id Internal store code
    #' @param geohash Geohash of the store location
    #' @param latitude Geographic latitude coordinate of the store
    #' @param longitude Geographic longitude coordinate of the store
    #' @param store_name Store name
    #' @param ... Other optional arguments.
    initialize = function(`store_code`, `store_id`, `geohash` = NULL, `latitude` = NULL, `longitude` = NULL, `store_name` = NULL, ...) {
      if (!missing(`store_code`)) {
        if (!(is.character(`store_code`) && length(`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", `store_code`))
        }
        self$`store_code` <- `store_code`
      }
      if (!missing(`store_id`)) {
        if (!(is.character(`store_id`) && length(`store_id`) == 1)) {
          stop(paste("Error! Invalid data for `store_id`. Must be a string:", `store_id`))
        }
        self$`store_id` <- `store_id`
      }
      if (!is.null(`geohash`)) {
        if (!(is.character(`geohash`) && length(`geohash`) == 1)) {
          stop(paste("Error! Invalid data for `geohash`. Must be a string:", `geohash`))
        }
        self$`geohash` <- `geohash`
      }
      if (!is.null(`latitude`)) {
        if (!(is.numeric(`latitude`) && length(`latitude`) == 1)) {
          stop(paste("Error! Invalid data for `latitude`. Must be a number:", `latitude`))
        }
        self$`latitude` <- `latitude`
      }
      if (!is.null(`longitude`)) {
        if (!(is.numeric(`longitude`) && length(`longitude`) == 1)) {
          stop(paste("Error! Invalid data for `longitude`. Must be a number:", `longitude`))
        }
        self$`longitude` <- `longitude`
      }
      if (!is.null(`store_name`)) {
        if (!(is.character(`store_name`) && length(`store_name`) == 1)) {
          stop(paste("Error! Invalid data for `store_name`. Must be a string:", `store_name`))
        }
        self$`store_name` <- `store_name`
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
    #' @return StoreMetadata as a base R list.
    #' @examples
    #' # convert array of StoreMetadata (x) to a data frame
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
    #' Convert StoreMetadata to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      StoreMetadataObject <- list()
      if (!is.null(self$`geohash`)) {
        StoreMetadataObject[["geohash"]] <-
          self$`geohash`
      }
      if (!is.null(self$`latitude`)) {
        StoreMetadataObject[["latitude"]] <-
          self$`latitude`
      }
      if (!is.null(self$`longitude`)) {
        StoreMetadataObject[["longitude"]] <-
          self$`longitude`
      }
      if (!is.null(self$`store_code`)) {
        StoreMetadataObject[["store_code"]] <-
          self$`store_code`
      }
      if (!is.null(self$`store_id`)) {
        StoreMetadataObject[["store_id"]] <-
          self$`store_id`
      }
      if (!is.null(self$`store_name`)) {
        StoreMetadataObject[["store_name"]] <-
          self$`store_name`
      }
      return(StoreMetadataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of StoreMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of StoreMetadata
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`geohash`)) {
        self$`geohash` <- this_object$`geohash`
      }
      if (!is.null(this_object$`latitude`)) {
        self$`latitude` <- this_object$`latitude`
      }
      if (!is.null(this_object$`longitude`)) {
        self$`longitude` <- this_object$`longitude`
      }
      if (!is.null(this_object$`store_code`)) {
        self$`store_code` <- this_object$`store_code`
      }
      if (!is.null(this_object$`store_id`)) {
        self$`store_id` <- this_object$`store_id`
      }
      if (!is.null(this_object$`store_name`)) {
        self$`store_name` <- this_object$`store_name`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return StoreMetadata in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of StoreMetadata
    #'
    #' @param input_json the JSON input
    #' @return the instance of StoreMetadata
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`geohash` <- this_object$`geohash`
      self$`latitude` <- this_object$`latitude`
      self$`longitude` <- this_object$`longitude`
      self$`store_code` <- this_object$`store_code`
      self$`store_id` <- this_object$`store_id`
      self$`store_name` <- this_object$`store_name`
      self
    },

    #' @description
    #' Validate JSON input with respect to StoreMetadata and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `store_code`
      if (!is.null(input_json$`store_code`)) {
        if (!(is.character(input_json$`store_code`) && length(input_json$`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", input_json$`store_code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StoreMetadata: the required field `store_code` is missing."))
      }
      # check the required field `store_id`
      if (!is.null(input_json$`store_id`)) {
        if (!(is.character(input_json$`store_id`) && length(input_json$`store_id`) == 1)) {
          stop(paste("Error! Invalid data for `store_id`. Must be a string:", input_json$`store_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StoreMetadata: the required field `store_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of StoreMetadata
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
        return(FALSE)
      }

      # check if the required `store_id` is null
      if (is.null(self$`store_id`)) {
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
      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
        invalid_fields["store_code"] <- "Non-nullable required field `store_code` cannot be null."
      }

      # check if the required `store_id` is null
      if (is.null(self$`store_id`)) {
        invalid_fields["store_id"] <- "Non-nullable required field `store_id` cannot be null."
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
# StoreMetadata$unlock()
#
## Below is an example to define the print function
# StoreMetadata$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# StoreMetadata$lock()

