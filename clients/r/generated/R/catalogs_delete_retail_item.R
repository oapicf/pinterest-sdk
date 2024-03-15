#' Create a new CatalogsDeleteRetailItem
#'
#' @description
#' An item to be deleted
#'
#' @docType class
#' @title CatalogsDeleteRetailItem
#' @description CatalogsDeleteRetailItem Class
#' @format An \code{R6Class} generator object
#' @field item_id The catalog item id in the merchant namespace character
#' @field operation  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsDeleteRetailItem <- R6::R6Class(
  "CatalogsDeleteRetailItem",
  public = list(
    `item_id` = NULL,
    `operation` = NULL,
    #' Initialize a new CatalogsDeleteRetailItem class.
    #'
    #' @description
    #' Initialize a new CatalogsDeleteRetailItem class.
    #'
    #' @param item_id The catalog item id in the merchant namespace
    #' @param operation operation
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`item_id`, `operation`, ...) {
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`operation`)) {
        if (!(`operation` %in% c("CREATE", "UPDATE", "UPSERT", "DELETE"))) {
          stop(paste("Error! \"", `operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\", \"UPDATE\", \"UPSERT\", \"DELETE\".", sep = ""))
        }
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsDeleteRetailItem in JSON format
    #' @export
    toJSON = function() {
      CatalogsDeleteRetailItemObject <- list()
      if (!is.null(self$`item_id`)) {
        CatalogsDeleteRetailItemObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`operation`)) {
        CatalogsDeleteRetailItemObject[["operation"]] <-
          self$`operation`
      }
      CatalogsDeleteRetailItemObject
    },
    #' Deserialize JSON string into an instance of CatalogsDeleteRetailItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsDeleteRetailItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsDeleteRetailItem
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`operation`)) {
        if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE", "UPDATE", "UPSERT", "DELETE"))) {
          stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\", \"UPDATE\", \"UPSERT\", \"DELETE\".", sep = ""))
        }
        self$`operation` <- this_object$`operation`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsDeleteRetailItem in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`item_id`)) {
          sprintf(
          '"item_id":
            "%s"
                    ',
          self$`item_id`
          )
        },
        if (!is.null(self$`operation`)) {
          sprintf(
          '"operation":
            "%s"
                    ',
          self$`operation`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsDeleteRetailItem
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsDeleteRetailItem
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsDeleteRetailItem
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`item_id` <- this_object$`item_id`
      if (!is.null(this_object$`operation`) && !(this_object$`operation` %in% c("CREATE", "UPDATE", "UPSERT", "DELETE"))) {
        stop(paste("Error! \"", this_object$`operation`, "\" cannot be assigned to `operation`. Must be \"CREATE\", \"UPDATE\", \"UPSERT\", \"DELETE\".", sep = ""))
      }
      self$`operation` <- this_object$`operation`
      self
    },
    #' Validate JSON input with respect to CatalogsDeleteRetailItem
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsDeleteRetailItem and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsDeleteRetailItem: the required field `item_id` is missing."))
      }
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsDeleteRetailItem: the required field `operation` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsDeleteRetailItem
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
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
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
      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
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
# CatalogsDeleteRetailItem$unlock()
#
## Below is an example to define the print function
# CatalogsDeleteRetailItem$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsDeleteRetailItem$lock()

