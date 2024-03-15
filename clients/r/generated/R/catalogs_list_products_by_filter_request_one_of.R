#' Create a new CatalogsListProductsByFilterRequestOneOf
#'
#' @description
#' Request object to list products for a given feed_id and product group filter.
#'
#' @docType class
#' @title CatalogsListProductsByFilterRequestOneOf
#' @description CatalogsListProductsByFilterRequestOneOf Class
#' @format An \code{R6Class} generator object
#' @field feed_id Catalog Feed id pertaining to the catalog product group filter. character
#' @field filters  \link{CatalogsProductGroupFilters}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsListProductsByFilterRequestOneOf <- R6::R6Class(
  "CatalogsListProductsByFilterRequestOneOf",
  public = list(
    `feed_id` = NULL,
    `filters` = NULL,
    #' Initialize a new CatalogsListProductsByFilterRequestOneOf class.
    #'
    #' @description
    #' Initialize a new CatalogsListProductsByFilterRequestOneOf class.
    #'
    #' @param feed_id Catalog Feed id pertaining to the catalog product group filter.
    #' @param filters filters
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`feed_id`, `filters`, ...) {
      if (!missing(`feed_id`)) {
        if (!(is.character(`feed_id`) && length(`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", `feed_id`))
        }
        self$`feed_id` <- `feed_id`
      }
      if (!missing(`filters`)) {
        stopifnot(R6::is.R6(`filters`))
        self$`filters` <- `filters`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsListProductsByFilterRequestOneOf in JSON format
    #' @export
    toJSON = function() {
      CatalogsListProductsByFilterRequestOneOfObject <- list()
      if (!is.null(self$`feed_id`)) {
        CatalogsListProductsByFilterRequestOneOfObject[["feed_id"]] <-
          self$`feed_id`
      }
      if (!is.null(self$`filters`)) {
        CatalogsListProductsByFilterRequestOneOfObject[["filters"]] <-
          self$`filters`$toJSON()
      }
      CatalogsListProductsByFilterRequestOneOfObject
    },
    #' Deserialize JSON string into an instance of CatalogsListProductsByFilterRequestOneOf
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsListProductsByFilterRequestOneOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsListProductsByFilterRequestOneOf
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feed_id`)) {
        self$`feed_id` <- this_object$`feed_id`
      }
      if (!is.null(this_object$`filters`)) {
        `filters_object` <- CatalogsProductGroupFilters$new()
        `filters_object`$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
        self$`filters` <- `filters_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsListProductsByFilterRequestOneOf in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`feed_id`)) {
          sprintf(
          '"feed_id":
            "%s"
                    ',
          self$`feed_id`
          )
        },
        if (!is.null(self$`filters`)) {
          sprintf(
          '"filters":
          %s
          ',
          jsonlite::toJSON(self$`filters`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsListProductsByFilterRequestOneOf
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsListProductsByFilterRequestOneOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsListProductsByFilterRequestOneOf
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feed_id` <- this_object$`feed_id`
      self$`filters` <- CatalogsProductGroupFilters$new()$fromJSON(jsonlite::toJSON(this_object$`filters`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsListProductsByFilterRequestOneOf
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsListProductsByFilterRequestOneOf and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `feed_id`
      if (!is.null(input_json$`feed_id`)) {
        if (!(is.character(input_json$`feed_id`) && length(input_json$`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", input_json$`feed_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsListProductsByFilterRequestOneOf: the required field `feed_id` is missing."))
      }
      # check the required field `filters`
      if (!is.null(input_json$`filters`)) {
        stopifnot(R6::is.R6(input_json$`filters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsListProductsByFilterRequestOneOf: the required field `filters` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsListProductsByFilterRequestOneOf
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        invalid_fields["feed_id"] <- "Non-nullable required field `feed_id` cannot be null."
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
        invalid_fields["feed_id"] <- "Invalid value for `feed_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `filters` is null
      if (is.null(self$`filters`)) {
        invalid_fields["filters"] <- "Non-nullable required field `filters` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CatalogsListProductsByFilterRequestOneOf$unlock()
#
## Below is an example to define the print function
# CatalogsListProductsByFilterRequestOneOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsListProductsByFilterRequestOneOf$lock()

