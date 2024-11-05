#' Create a new CatalogsFeedIngestion
#'
#' @description
#' CatalogsFeedIngestion Class
#'
#' @docType class
#' @title CatalogsFeedIngestion
#' @description CatalogsFeedIngestion Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field feed_id  character
#' @field created_at  character
#' @field status  \link{CatalogsFeedProcessingStatus}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedIngestion <- R6::R6Class(
  "CatalogsFeedIngestion",
  public = list(
    `id` = NULL,
    `feed_id` = NULL,
    `created_at` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedIngestion class.
    #'
    #' @param id id
    #' @param feed_id feed_id
    #' @param created_at created_at
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`id`, `feed_id`, `created_at`, `status`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`feed_id`)) {
        if (!(is.character(`feed_id`) && length(`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", `feed_id`))
        }
        self$`feed_id` <- `feed_id`
      }
      if (!missing(`created_at`)) {
        if (!(is.character(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedIngestion in JSON format
    toJSON = function() {
      CatalogsFeedIngestionObject <- list()
      if (!is.null(self$`id`)) {
        CatalogsFeedIngestionObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`feed_id`)) {
        CatalogsFeedIngestionObject[["feed_id"]] <-
          self$`feed_id`
      }
      if (!is.null(self$`created_at`)) {
        CatalogsFeedIngestionObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`status`)) {
        CatalogsFeedIngestionObject[["status"]] <-
          self$`status`$toJSON()
      }
      CatalogsFeedIngestionObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestion
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestion
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`feed_id`)) {
        self$`feed_id` <- this_object$`feed_id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- CatalogsFeedProcessingStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedIngestion in JSON format
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
        if (!is.null(self$`feed_id`)) {
          sprintf(
          '"feed_id":
            "%s"
                    ',
          self$`feed_id`
          )
        },
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            "%s"
                    ',
          self$`created_at`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestion
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestion
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`feed_id` <- this_object$`feed_id`
      self$`created_at` <- this_object$`created_at`
      self$`status` <- CatalogsFeedProcessingStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedIngestion and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedIngestion: the required field `id` is missing."))
      }
      # check the required field `feed_id`
      if (!is.null(input_json$`feed_id`)) {
        if (!(is.character(input_json$`feed_id`) && length(input_json$`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", input_json$`feed_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedIngestion: the required field `feed_id` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.character(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedIngestion: the required field `created_at` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedIngestion: the required field `status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedIngestion
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        invalid_fields["feed_id"] <- "Non-nullable required field `feed_id` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# CatalogsFeedIngestion$unlock()
#
## Below is an example to define the print function
# CatalogsFeedIngestion$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedIngestion$lock()

