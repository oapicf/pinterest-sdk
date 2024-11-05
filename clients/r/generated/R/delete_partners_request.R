#' Create a new DeletePartnersRequest
#'
#' @description
#' DeletePartnersRequest Class
#'
#' @docType class
#' @title DeletePartnersRequest
#' @description DeletePartnersRequest Class
#' @format An \code{R6Class} generator object
#' @field partner_ids  list(character)
#' @field partner_type  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeletePartnersRequest <- R6::R6Class(
  "DeletePartnersRequest",
  public = list(
    `partner_ids` = NULL,
    `partner_type` = NULL,

    #' @description
    #' Initialize a new DeletePartnersRequest class.
    #'
    #' @param partner_ids partner_ids
    #' @param partner_type partner_type
    #' @param ... Other optional arguments.
    initialize = function(`partner_ids`, `partner_type` = NULL, ...) {
      if (!missing(`partner_ids`)) {
        stopifnot(is.vector(`partner_ids`), length(`partner_ids`) != 0)
        sapply(`partner_ids`, function(x) stopifnot(is.character(x)))
        self$`partner_ids` <- `partner_ids`
      }
      if (!is.null(`partner_type`)) {
        if (!(is.character(`partner_type`) && length(`partner_type`) == 1)) {
          stop(paste("Error! Invalid data for `partner_type`. Must be a string:", `partner_type`))
        }
        self$`partner_type` <- `partner_type`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletePartnersRequest in JSON format
    toJSON = function() {
      DeletePartnersRequestObject <- list()
      if (!is.null(self$`partner_ids`)) {
        DeletePartnersRequestObject[["partner_ids"]] <-
          self$`partner_ids`
      }
      if (!is.null(self$`partner_type`)) {
        DeletePartnersRequestObject[["partner_type"]] <-
          self$`partner_type`
      }
      DeletePartnersRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnersRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`partner_ids`)) {
        self$`partner_ids` <- ApiClient$new()$deserializeObj(this_object$`partner_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`partner_type`)) {
        self$`partner_type` <- this_object$`partner_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return DeletePartnersRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`partner_ids`)) {
          sprintf(
          '"partner_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`partner_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`partner_type`)) {
          sprintf(
          '"partner_type":
            "%s"
                    ',
          self$`partner_type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeletePartnersRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeletePartnersRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`partner_ids` <- ApiClient$new()$deserializeObj(this_object$`partner_ids`, "array[character]", loadNamespace("openapi"))
      self$`partner_type` <- this_object$`partner_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to DeletePartnersRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `partner_ids`
      if (!is.null(input_json$`partner_ids`)) {
        stopifnot(is.vector(input_json$`partner_ids`), length(input_json$`partner_ids`) != 0)
        tmp <- sapply(input_json$`partner_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeletePartnersRequest: the required field `partner_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeletePartnersRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `partner_ids` is null
      if (is.null(self$`partner_ids`)) {
        return(FALSE)
      }

      if (length(self$`partner_ids`) > 50) {
        return(FALSE)
      }
      if (length(self$`partner_ids`) < 1) {
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
      # check if the required `partner_ids` is null
      if (is.null(self$`partner_ids`)) {
        invalid_fields["partner_ids"] <- "Non-nullable required field `partner_ids` cannot be null."
      }

      if (length(self$`partner_ids`) > 50) {
        invalid_fields["partner_ids"] <- "Invalid length for `partner_ids`, number of items must be less than or equal to 50."
      }
      if (length(self$`partner_ids`) < 1) {
        invalid_fields["partner_ids"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# DeletePartnersRequest$unlock()
#
## Below is an example to define the print function
# DeletePartnersRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeletePartnersRequest$lock()

