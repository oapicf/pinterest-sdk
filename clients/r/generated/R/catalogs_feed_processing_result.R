#' Create a new CatalogsFeedProcessingResult
#'
#' @description
#' CatalogsFeedProcessingResult Class
#'
#' @docType class
#' @title CatalogsFeedProcessingResult
#' @description CatalogsFeedProcessingResult Class
#' @format An \code{R6Class} generator object
#' @field created_at  character
#' @field id ID of the feed processing result. character
#' @field ingestion_details  \link{CatalogsFeedIngestionDetails}
#' @field product_counts  \link{CatalogsFeedProductCounts}
#' @field status  \link{CatalogsFeedProcessingStatus}
#' @field updated_at  character
#' @field validation_details  \link{CatalogsFeedValidationDetails}
#' @field video_counts  \link{CatalogsFeedVideoCounts} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedProcessingResult <- R6::R6Class(
  "CatalogsFeedProcessingResult",
  public = list(
    `created_at` = NULL,
    `id` = NULL,
    `ingestion_details` = NULL,
    `product_counts` = NULL,
    `status` = NULL,
    `updated_at` = NULL,
    `validation_details` = NULL,
    `video_counts` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedProcessingResult class.
    #'
    #' @param created_at created_at
    #' @param id ID of the feed processing result.
    #' @param ingestion_details ingestion_details
    #' @param product_counts product_counts
    #' @param status status
    #' @param updated_at updated_at
    #' @param validation_details validation_details
    #' @param video_counts video_counts
    #' @param ... Other optional arguments.
    initialize = function(`created_at`, `id`, `ingestion_details`, `product_counts`, `status`, `updated_at`, `validation_details`, `video_counts` = NULL, ...) {
      if (!missing(`created_at`)) {
        if (!(is.character(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`ingestion_details`)) {
        stopifnot(R6::is.R6(`ingestion_details`))
        self$`ingestion_details` <- `ingestion_details`
      }
      if (!missing(`product_counts`)) {
        stopifnot(R6::is.R6(`product_counts`))
        self$`product_counts` <- `product_counts`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!missing(`updated_at`)) {
        if (!(is.character(`updated_at`) && length(`updated_at`) == 1)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be a string:", `updated_at`))
        }
        self$`updated_at` <- `updated_at`
      }
      if (!missing(`validation_details`)) {
        stopifnot(R6::is.R6(`validation_details`))
        self$`validation_details` <- `validation_details`
      }
      if (!is.null(`video_counts`)) {
        stopifnot(R6::is.R6(`video_counts`))
        self$`video_counts` <- `video_counts`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CatalogsFeedProcessingResult as a base R list.
    #' @examples
    #' # convert array of CatalogsFeedProcessingResult (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CatalogsFeedProcessingResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsFeedProcessingResultObject <- list()
      if (!is.null(self$`created_at`)) {
        CatalogsFeedProcessingResultObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`id`)) {
        CatalogsFeedProcessingResultObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ingestion_details`)) {
        CatalogsFeedProcessingResultObject[["ingestion_details"]] <-
          self$extractSimpleType(self$`ingestion_details`)
      }
      if (!is.null(self$`product_counts`)) {
        CatalogsFeedProcessingResultObject[["product_counts"]] <-
          self$extractSimpleType(self$`product_counts`)
      }
      if (!is.null(self$`status`)) {
        CatalogsFeedProcessingResultObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`updated_at`)) {
        CatalogsFeedProcessingResultObject[["updated_at"]] <-
          self$`updated_at`
      }
      if (!is.null(self$`validation_details`)) {
        CatalogsFeedProcessingResultObject[["validation_details"]] <-
          self$extractSimpleType(self$`validation_details`)
      }
      if (!is.null(self$`video_counts`)) {
        CatalogsFeedProcessingResultObject[["video_counts"]] <-
          self$extractSimpleType(self$`video_counts`)
      }
      return(CatalogsFeedProcessingResultObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProcessingResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProcessingResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ingestion_details`)) {
        `ingestion_details_object` <- CatalogsFeedIngestionDetails$new()
        `ingestion_details_object`$fromJSON(jsonlite::toJSON(this_object$`ingestion_details`, auto_unbox = TRUE, digits = NA))
        self$`ingestion_details` <- `ingestion_details_object`
      }
      if (!is.null(this_object$`product_counts`)) {
        `product_counts_object` <- CatalogsFeedProductCounts$new()
        `product_counts_object`$fromJSON(jsonlite::toJSON(this_object$`product_counts`, auto_unbox = TRUE, digits = NA))
        self$`product_counts` <- `product_counts_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- CatalogsFeedProcessingStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`updated_at`)) {
        self$`updated_at` <- this_object$`updated_at`
      }
      if (!is.null(this_object$`validation_details`)) {
        `validation_details_object` <- CatalogsFeedValidationDetails$new()
        `validation_details_object`$fromJSON(jsonlite::toJSON(this_object$`validation_details`, auto_unbox = TRUE, digits = NA))
        self$`validation_details` <- `validation_details_object`
      }
      if (!is.null(this_object$`video_counts`)) {
        `video_counts_object` <- CatalogsFeedVideoCounts$new()
        `video_counts_object`$fromJSON(jsonlite::toJSON(this_object$`video_counts`, auto_unbox = TRUE, digits = NA))
        self$`video_counts` <- `video_counts_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsFeedProcessingResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProcessingResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProcessingResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`created_at` <- this_object$`created_at`
      self$`id` <- this_object$`id`
      self$`ingestion_details` <- CatalogsFeedIngestionDetails$new()$fromJSON(jsonlite::toJSON(this_object$`ingestion_details`, auto_unbox = TRUE, digits = NA))
      self$`product_counts` <- CatalogsFeedProductCounts$new()$fromJSON(jsonlite::toJSON(this_object$`product_counts`, auto_unbox = TRUE, digits = NA))
      self$`status` <- CatalogsFeedProcessingStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`updated_at` <- this_object$`updated_at`
      self$`validation_details` <- CatalogsFeedValidationDetails$new()$fromJSON(jsonlite::toJSON(this_object$`validation_details`, auto_unbox = TRUE, digits = NA))
      self$`video_counts` <- CatalogsFeedVideoCounts$new()$fromJSON(jsonlite::toJSON(this_object$`video_counts`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedProcessingResult and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.character(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingResult: the required field `created_at` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingResult: the required field `id` is missing."))
      }
      # check the required field `ingestion_details`
      if (!is.null(input_json$`ingestion_details`)) {
        stopifnot(R6::is.R6(input_json$`ingestion_details`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingResult: the required field `ingestion_details` is missing."))
      }
      # check the required field `product_counts`
      if (!is.null(input_json$`product_counts`)) {
        stopifnot(R6::is.R6(input_json$`product_counts`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingResult: the required field `product_counts` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingResult: the required field `status` is missing."))
      }
      # check the required field `updated_at`
      if (!is.null(input_json$`updated_at`)) {
        if (!(is.character(input_json$`updated_at`) && length(input_json$`updated_at`) == 1)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be a string:", input_json$`updated_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingResult: the required field `updated_at` is missing."))
      }
      # check the required field `validation_details`
      if (!is.null(input_json$`validation_details`)) {
        stopifnot(R6::is.R6(input_json$`validation_details`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedProcessingResult: the required field `validation_details` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedProcessingResult
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `ingestion_details` is null
      if (is.null(self$`ingestion_details`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `updated_at` is null
      if (is.null(self$`updated_at`)) {
        return(FALSE)
      }

      # check if the required `validation_details` is null
      if (is.null(self$`validation_details`)) {
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
      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `ingestion_details` is null
      if (is.null(self$`ingestion_details`)) {
        invalid_fields["ingestion_details"] <- "Non-nullable required field `ingestion_details` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `updated_at` is null
      if (is.null(self$`updated_at`)) {
        invalid_fields["updated_at"] <- "Non-nullable required field `updated_at` cannot be null."
      }

      # check if the required `validation_details` is null
      if (is.null(self$`validation_details`)) {
        invalid_fields["validation_details"] <- "Non-nullable required field `validation_details` cannot be null."
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
# CatalogsFeedProcessingResult$unlock()
#
## Below is an example to define the print function
# CatalogsFeedProcessingResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedProcessingResult$lock()

