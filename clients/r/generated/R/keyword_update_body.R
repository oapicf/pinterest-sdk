#' Create a new KeywordUpdateBody
#'
#' @description
#' KeywordUpdateBody Class
#'
#' @docType class
#' @title KeywordUpdateBody
#' @description KeywordUpdateBody Class
#' @format An \code{R6Class} generator object
#' @field keywords Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...] list(\link{KeywordUpdate})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordUpdateBody <- R6::R6Class(
  "KeywordUpdateBody",
  public = list(
    `keywords` = NULL,
    #' Initialize a new KeywordUpdateBody class.
    #'
    #' @description
    #' Initialize a new KeywordUpdateBody class.
    #'
    #' @param keywords Keywords to update. Object array. Each object has 3 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>3. \"bid\": number<br>For example: [{\"id\":\"2886610576653\", \"archived\": false, \"bid\": 20000}, {\"id\":\"2886610576654\",  \"archived\": true, \"bid\": 20000}, ...]
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`keywords`, ...) {
      if (!missing(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return KeywordUpdateBody in JSON format
    #' @export
    toJSON = function() {
      KeywordUpdateBodyObject <- list()
      if (!is.null(self$`keywords`)) {
        KeywordUpdateBodyObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      KeywordUpdateBodyObject
    },
    #' Deserialize JSON string into an instance of KeywordUpdateBody
    #'
    #' @description
    #' Deserialize JSON string into an instance of KeywordUpdateBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordUpdateBody
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordUpdate]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return KeywordUpdateBody in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`keywords`)) {
          sprintf(
          '"keywords":
          [%s]
',
          paste(sapply(self$`keywords`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of KeywordUpdateBody
    #'
    #' @description
    #' Deserialize JSON string into an instance of KeywordUpdateBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordUpdateBody
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordUpdate]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to KeywordUpdateBody
    #'
    #' @description
    #' Validate JSON input with respect to KeywordUpdateBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `keywords`
      if (!is.null(input_json$`keywords`)) {
        stopifnot(is.vector(input_json$`keywords`), length(input_json$`keywords`) != 0)
        tmp <- sapply(input_json$`keywords`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordUpdateBody: the required field `keywords` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordUpdateBody
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
      # check if the required `keywords` is null
      if (is.null(self$`keywords`)) {
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
      # check if the required `keywords` is null
      if (is.null(self$`keywords`)) {
        invalid_fields["keywords"] <- "Non-nullable required field `keywords` cannot be null."
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
# KeywordUpdateBody$unlock()
#
## Below is an example to define the print function
# KeywordUpdateBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordUpdateBody$lock()

