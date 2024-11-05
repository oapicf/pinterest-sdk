#' Create a new KeywordsRequest
#'
#' @description
#' KeywordsRequest Class
#'
#' @docType class
#' @title KeywordsRequest
#' @description KeywordsRequest Class
#' @format An \code{R6Class} generator object
#' @field keywords Keyword JSON array. Each array element has 3 fields list(\link{KeywordsCommon})
#' @field parent_id Keyword parent entity ID (advertiser, campaign, ad group). character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordsRequest <- R6::R6Class(
  "KeywordsRequest",
  public = list(
    `keywords` = NULL,
    `parent_id` = NULL,

    #' @description
    #' Initialize a new KeywordsRequest class.
    #'
    #' @param keywords Keyword JSON array. Each array element has 3 fields
    #' @param parent_id Keyword parent entity ID (advertiser, campaign, ad group).
    #' @param ... Other optional arguments.
    initialize = function(`keywords`, `parent_id`, ...) {
      if (!missing(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
      if (!missing(`parent_id`)) {
        if (!(is.character(`parent_id`) && length(`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", `parent_id`))
        }
        self$`parent_id` <- `parent_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordsRequest in JSON format
    toJSON = function() {
      KeywordsRequestObject <- list()
      if (!is.null(self$`keywords`)) {
        KeywordsRequestObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      if (!is.null(self$`parent_id`)) {
        KeywordsRequestObject[["parent_id"]] <-
          self$`parent_id`
      }
      KeywordsRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordsCommon]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`parent_id`)) {
        self$`parent_id` <- this_object$`parent_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return KeywordsRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`keywords`)) {
          sprintf(
          '"keywords":
          [%s]
',
          paste(sapply(self$`keywords`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`parent_id`)) {
          sprintf(
          '"parent_id":
            "%s"
                    ',
          self$`parent_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of KeywordsRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[KeywordsCommon]", loadNamespace("openapi"))
      self$`parent_id` <- this_object$`parent_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to KeywordsRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `keywords`
      if (!is.null(input_json$`keywords`)) {
        stopifnot(is.vector(input_json$`keywords`), length(input_json$`keywords`) != 0)
        tmp <- sapply(input_json$`keywords`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordsRequest: the required field `keywords` is missing."))
      }
      # check the required field `parent_id`
      if (!is.null(input_json$`parent_id`)) {
        if (!(is.character(input_json$`parent_id`) && length(input_json$`parent_id`) == 1)) {
          stop(paste("Error! Invalid data for `parent_id`. Must be a string:", input_json$`parent_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for KeywordsRequest: the required field `parent_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of KeywordsRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `keywords` is null
      if (is.null(self$`keywords`)) {
        return(FALSE)
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`parent_id`, "^((AG)|C)?\\d+$")) {
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
      # check if the required `keywords` is null
      if (is.null(self$`keywords`)) {
        invalid_fields["keywords"] <- "Non-nullable required field `keywords` cannot be null."
      }

      # check if the required `parent_id` is null
      if (is.null(self$`parent_id`)) {
        invalid_fields["parent_id"] <- "Non-nullable required field `parent_id` cannot be null."
      }

      if (!str_detect(self$`parent_id`, "^((AG)|C)?\\d+$")) {
        invalid_fields["parent_id"] <- "Invalid value for `parent_id`, must conform to the pattern ^((AG)|C)?\\d+$."
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
# KeywordsRequest$unlock()
#
## Below is an example to define the print function
# KeywordsRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordsRequest$lock()

