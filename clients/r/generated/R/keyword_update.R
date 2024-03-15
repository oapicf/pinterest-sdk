#' Create a new KeywordUpdate
#'
#' @description
#' KeywordUpdate Class
#'
#' @docType class
#' @title KeywordUpdate
#' @description KeywordUpdate Class
#' @format An \code{R6Class} generator object
#' @field id Keyword ID. character
#' @field archived Is keyword archived? character [optional]
#' @field bid Keyword custom bid in microcurrency - null if inherited from parent ad group. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordUpdate <- R6::R6Class(
  "KeywordUpdate",
  public = list(
    `id` = NULL,
    `archived` = NULL,
    `bid` = NULL,
    #' Initialize a new KeywordUpdate class.
    #'
    #' @description
    #' Initialize a new KeywordUpdate class.
    #'
    #' @param id Keyword ID.
    #' @param archived Is keyword archived?
    #' @param bid Keyword custom bid in microcurrency - null if inherited from parent ad group.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `archived` = NULL, `bid` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`archived`)) {
        if (!(is.logical(`archived`) && length(`archived`) == 1)) {
          stop(paste("Error! Invalid data for `archived`. Must be a boolean:", `archived`))
        }
        self$`archived` <- `archived`
      }
      if (!is.null(`bid`)) {
        if (!(is.numeric(`bid`) && length(`bid`) == 1)) {
          stop(paste("Error! Invalid data for `bid`. Must be an integer:", `bid`))
        }
        self$`bid` <- `bid`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return KeywordUpdate in JSON format
    #' @export
    toJSON = function() {
      KeywordUpdateObject <- list()
      if (!is.null(self$`id`)) {
        KeywordUpdateObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`archived`)) {
        KeywordUpdateObject[["archived"]] <-
          self$`archived`
      }
      if (!is.null(self$`bid`)) {
        KeywordUpdateObject[["bid"]] <-
          self$`bid`
      }
      KeywordUpdateObject
    },
    #' Deserialize JSON string into an instance of KeywordUpdate
    #'
    #' @description
    #' Deserialize JSON string into an instance of KeywordUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordUpdate
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`archived`)) {
        self$`archived` <- this_object$`archived`
      }
      if (!is.null(this_object$`bid`)) {
        self$`bid` <- this_object$`bid`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return KeywordUpdate in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`archived`)) {
          sprintf(
          '"archived":
            %s
                    ',
          tolower(self$`archived`)
          )
        },
        if (!is.null(self$`bid`)) {
          sprintf(
          '"bid":
            %d
                    ',
          self$`bid`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of KeywordUpdate
    #'
    #' @description
    #' Deserialize JSON string into an instance of KeywordUpdate
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordUpdate
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`archived` <- this_object$`archived`
      self$`bid` <- this_object$`bid`
      self
    },
    #' Validate JSON input with respect to KeywordUpdate
    #'
    #' @description
    #' Validate JSON input with respect to KeywordUpdate and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordUpdate: the required field `id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordUpdate
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (self$`bid` < 1) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (self$`bid` < 1) {
        invalid_fields["bid"] <- "Invalid value for `bid`, must be bigger than or equal to 1."
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
# KeywordUpdate$unlock()
#
## Below is an example to define the print function
# KeywordUpdate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordUpdate$lock()

