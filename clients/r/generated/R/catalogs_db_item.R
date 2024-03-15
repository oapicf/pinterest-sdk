#' Create a new CatalogsDbItem
#'
#' @description
#' CatalogsDbItem Class
#'
#' @docType class
#' @title CatalogsDbItem
#' @description CatalogsDbItem Class
#' @format An \code{R6Class} generator object
#' @field created_at  character [optional]
#' @field id  character [optional]
#' @field updated_at  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsDbItem <- R6::R6Class(
  "CatalogsDbItem",
  public = list(
    `created_at` = NULL,
    `id` = NULL,
    `updated_at` = NULL,
    #' Initialize a new CatalogsDbItem class.
    #'
    #' @description
    #' Initialize a new CatalogsDbItem class.
    #'
    #' @param created_at created_at
    #' @param id id
    #' @param updated_at updated_at
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`created_at` = NULL, `id` = NULL, `updated_at` = NULL, ...) {
      if (!is.null(`created_at`)) {
        if (!is.character(`created_at`)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`updated_at`)) {
        if (!is.character(`updated_at`)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be a string:", `updated_at`))
        }
        self$`updated_at` <- `updated_at`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsDbItem in JSON format
    #' @export
    toJSON = function() {
      CatalogsDbItemObject <- list()
      if (!is.null(self$`created_at`)) {
        CatalogsDbItemObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`id`)) {
        CatalogsDbItemObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`updated_at`)) {
        CatalogsDbItemObject[["updated_at"]] <-
          self$`updated_at`
      }
      CatalogsDbItemObject
    },
    #' Deserialize JSON string into an instance of CatalogsDbItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsDbItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsDbItem
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`updated_at`)) {
        self$`updated_at` <- this_object$`updated_at`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsDbItem in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            "%s"
                    ',
          self$`created_at`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`updated_at`)) {
          sprintf(
          '"updated_at":
            "%s"
                    ',
          self$`updated_at`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsDbItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsDbItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsDbItem
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`created_at` <- this_object$`created_at`
      self$`id` <- this_object$`id`
      self$`updated_at` <- this_object$`updated_at`
      self
    },
    #' Validate JSON input with respect to CatalogsDbItem
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsDbItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsDbItem
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
# CatalogsDbItem$unlock()
#
## Below is an example to define the print function
# CatalogsDbItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsDbItem$lock()

