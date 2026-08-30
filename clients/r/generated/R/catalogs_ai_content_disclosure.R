#' Create a new CatalogsAiContentDisclosure
#'
#' @description
#' AI content disclosure for a single asset of a catalog item.
#'
#' @docType class
#' @title CatalogsAiContentDisclosure
#' @description CatalogsAiContentDisclosure Class
#' @format An \code{R6Class} generator object
#' @field disclosure Disclosure labels that apply to this asset. list(\link{CatalogsAiContentDisclosureLabel})
#' @field url URL of the asset. Must match one of image_link, additional_image_link, or video_link. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsAiContentDisclosure <- R6::R6Class(
  "CatalogsAiContentDisclosure",
  public = list(
    `disclosure` = NULL,
    `url` = NULL,

    #' @description
    #' Initialize a new CatalogsAiContentDisclosure class.
    #'
    #' @param disclosure Disclosure labels that apply to this asset.
    #' @param url URL of the asset. Must match one of image_link, additional_image_link, or video_link.
    #' @param ... Other optional arguments.
    initialize = function(`disclosure`, `url`, ...) {
      if (!missing(`disclosure`)) {
        stopifnot(is.vector(`disclosure`), length(`disclosure`) != 0)
        sapply(`disclosure`, function(x) stopifnot(R6::is.R6(x)))
        self$`disclosure` <- `disclosure`
      }
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
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
    #' @return CatalogsAiContentDisclosure as a base R list.
    #' @examples
    #' # convert array of CatalogsAiContentDisclosure (x) to a data frame
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
    #' Convert CatalogsAiContentDisclosure to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsAiContentDisclosureObject <- list()
      if (!is.null(self$`disclosure`)) {
        CatalogsAiContentDisclosureObject[["disclosure"]] <-
          self$extractSimpleType(self$`disclosure`)
      }
      if (!is.null(self$`url`)) {
        CatalogsAiContentDisclosureObject[["url"]] <-
          self$`url`
      }
      return(CatalogsAiContentDisclosureObject)
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
    #' Deserialize JSON string into an instance of CatalogsAiContentDisclosure
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsAiContentDisclosure
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`disclosure`)) {
        self$`disclosure` <- ApiClient$new()$deserializeObj(this_object$`disclosure`, "array[CatalogsAiContentDisclosureLabel]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsAiContentDisclosure in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsAiContentDisclosure
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsAiContentDisclosure
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`disclosure` <- ApiClient$new()$deserializeObj(this_object$`disclosure`, "array[CatalogsAiContentDisclosureLabel]", loadNamespace("openapi"))
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsAiContentDisclosure and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `disclosure`
      if (!is.null(input_json$`disclosure`)) {
        stopifnot(is.vector(input_json$`disclosure`), length(input_json$`disclosure`) != 0)
        tmp <- sapply(input_json$`disclosure`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsAiContentDisclosure: the required field `disclosure` is missing."))
      }
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsAiContentDisclosure: the required field `url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsAiContentDisclosure
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `disclosure` is null
      if (is.null(self$`disclosure`)) {
        return(FALSE)
      }

      if (length(self$`disclosure`) < 1) {
        return(FALSE)
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        return(FALSE)
      }

      if (nchar(self$`url`) > 2000) {
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
      # check if the required `disclosure` is null
      if (is.null(self$`disclosure`)) {
        invalid_fields["disclosure"] <- "Non-nullable required field `disclosure` cannot be null."
      }

      if (length(self$`disclosure`) < 1) {
        invalid_fields["disclosure"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
      }

      if (nchar(self$`url`) > 2000) {
        invalid_fields["url"] <- "Invalid length for `url`, must be smaller than or equal to 2000."
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
# CatalogsAiContentDisclosure$unlock()
#
## Below is an example to define the print function
# CatalogsAiContentDisclosure$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsAiContentDisclosure$lock()

