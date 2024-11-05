#' Create a new MembersToDeleteBody
#'
#' @description
#' MembersToDeleteBody Class
#'
#' @docType class
#' @title MembersToDeleteBody
#' @description MembersToDeleteBody Class
#' @format An \code{R6Class} generator object
#' @field members  list(\link{MembersToDeleteBodyMembersInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MembersToDeleteBody <- R6::R6Class(
  "MembersToDeleteBody",
  public = list(
    `members` = NULL,

    #' @description
    #' Initialize a new MembersToDeleteBody class.
    #'
    #' @param members members
    #' @param ... Other optional arguments.
    initialize = function(`members`, ...) {
      if (!missing(`members`)) {
        stopifnot(is.vector(`members`), length(`members`) != 0)
        sapply(`members`, function(x) stopifnot(R6::is.R6(x)))
        self$`members` <- `members`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MembersToDeleteBody in JSON format
    toJSON = function() {
      MembersToDeleteBodyObject <- list()
      if (!is.null(self$`members`)) {
        MembersToDeleteBodyObject[["members"]] <-
          lapply(self$`members`, function(x) x$toJSON())
      }
      MembersToDeleteBodyObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MembersToDeleteBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of MembersToDeleteBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`members`)) {
        self$`members` <- ApiClient$new()$deserializeObj(this_object$`members`, "array[MembersToDeleteBodyMembersInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MembersToDeleteBody in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`members`)) {
          sprintf(
          '"members":
          [%s]
',
          paste(sapply(self$`members`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MembersToDeleteBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of MembersToDeleteBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`members` <- ApiClient$new()$deserializeObj(this_object$`members`, "array[MembersToDeleteBodyMembersInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to MembersToDeleteBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `members`
      if (!is.null(input_json$`members`)) {
        stopifnot(is.vector(input_json$`members`), length(input_json$`members`) != 0)
        tmp <- sapply(input_json$`members`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MembersToDeleteBody: the required field `members` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MembersToDeleteBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `members` is null
      if (is.null(self$`members`)) {
        return(FALSE)
      }

      if (length(self$`members`) > 50) {
        return(FALSE)
      }
      if (length(self$`members`) < 1) {
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
      # check if the required `members` is null
      if (is.null(self$`members`)) {
        invalid_fields["members"] <- "Non-nullable required field `members` cannot be null."
      }

      if (length(self$`members`) > 50) {
        invalid_fields["members"] <- "Invalid length for `members`, number of items must be less than or equal to 50."
      }
      if (length(self$`members`) < 1) {
        invalid_fields["members"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# MembersToDeleteBody$unlock()
#
## Below is an example to define the print function
# MembersToDeleteBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MembersToDeleteBody$lock()

