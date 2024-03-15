#' Create a new CatalogsProduct
#'
#' @description
#' CatalogsProduct Class
#'
#' @docType class
#' @title CatalogsProduct
#' @description CatalogsProduct Class
#' @format An \code{R6Class} generator object
#' @field metadata  \link{CatalogsProductMetadata}
#' @field pin  \link{Pin}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProduct <- R6::R6Class(
  "CatalogsProduct",
  public = list(
    `metadata` = NULL,
    `pin` = NULL,
    #' Initialize a new CatalogsProduct class.
    #'
    #' @description
    #' Initialize a new CatalogsProduct class.
    #'
    #' @param metadata metadata
    #' @param pin pin
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`metadata`, `pin`, ...) {
      if (!missing(`metadata`)) {
        stopifnot(R6::is.R6(`metadata`))
        self$`metadata` <- `metadata`
      }
      if (!missing(`pin`)) {
        stopifnot(R6::is.R6(`pin`))
        self$`pin` <- `pin`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProduct in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductObject <- list()
      if (!is.null(self$`metadata`)) {
        CatalogsProductObject[["metadata"]] <-
          self$`metadata`$toJSON()
      }
      if (!is.null(self$`pin`)) {
        CatalogsProductObject[["pin"]] <-
          self$`pin`$toJSON()
      }
      CatalogsProductObject
    },
    #' Deserialize JSON string into an instance of CatalogsProduct
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProduct
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProduct
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`metadata`)) {
        `metadata_object` <- CatalogsProductMetadata$new()
        `metadata_object`$fromJSON(jsonlite::toJSON(this_object$`metadata`, auto_unbox = TRUE, digits = NA))
        self$`metadata` <- `metadata_object`
      }
      if (!is.null(this_object$`pin`)) {
        `pin_object` <- Pin$new()
        `pin_object`$fromJSON(jsonlite::toJSON(this_object$`pin`, auto_unbox = TRUE, digits = NA))
        self$`pin` <- `pin_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProduct in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`metadata`)) {
          sprintf(
          '"metadata":
          %s
          ',
          jsonlite::toJSON(self$`metadata`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`pin`)) {
          sprintf(
          '"pin":
          %s
          ',
          jsonlite::toJSON(self$`pin`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsProduct
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProduct
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProduct
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`metadata` <- CatalogsProductMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`metadata`, auto_unbox = TRUE, digits = NA))
      self$`pin` <- Pin$new()$fromJSON(jsonlite::toJSON(this_object$`pin`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsProduct
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProduct and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `metadata`
      if (!is.null(input_json$`metadata`)) {
        stopifnot(R6::is.R6(input_json$`metadata`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProduct: the required field `metadata` is missing."))
      }
      # check the required field `pin`
      if (!is.null(input_json$`pin`)) {
        stopifnot(R6::is.R6(input_json$`pin`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProduct: the required field `pin` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProduct
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
      # check if the required `metadata` is null
      if (is.null(self$`metadata`)) {
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
      # check if the required `metadata` is null
      if (is.null(self$`metadata`)) {
        invalid_fields["metadata"] <- "Non-nullable required field `metadata` cannot be null."
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
# CatalogsProduct$unlock()
#
## Below is an example to define the print function
# CatalogsProduct$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProduct$lock()

