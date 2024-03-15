#' Create a new CatalogsProductGroupProductCounts
#'
#' @description
#' Product counts for a CatalogsProductGroup
#'
#' @docType class
#' @title CatalogsProductGroupProductCounts
#' @description CatalogsProductGroupProductCounts Class
#' @format An \code{R6Class} generator object
#' @field in_stock  numeric
#' @field out_of_stock  numeric
#' @field preorder  numeric
#' @field total  numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsProductGroupProductCounts <- R6::R6Class(
  "CatalogsProductGroupProductCounts",
  public = list(
    `in_stock` = NULL,
    `out_of_stock` = NULL,
    `preorder` = NULL,
    `total` = NULL,
    #' Initialize a new CatalogsProductGroupProductCounts class.
    #'
    #' @description
    #' Initialize a new CatalogsProductGroupProductCounts class.
    #'
    #' @param in_stock in_stock
    #' @param out_of_stock out_of_stock
    #' @param preorder preorder
    #' @param total total
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`in_stock`, `out_of_stock`, `preorder`, `total`, ...) {
      if (!missing(`in_stock`)) {
        self$`in_stock` <- `in_stock`
      }
      if (!missing(`out_of_stock`)) {
        self$`out_of_stock` <- `out_of_stock`
      }
      if (!missing(`preorder`)) {
        self$`preorder` <- `preorder`
      }
      if (!missing(`total`)) {
        self$`total` <- `total`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupProductCounts in JSON format
    #' @export
    toJSON = function() {
      CatalogsProductGroupProductCountsObject <- list()
      if (!is.null(self$`in_stock`)) {
        CatalogsProductGroupProductCountsObject[["in_stock"]] <-
          self$`in_stock`
      }
      if (!is.null(self$`out_of_stock`)) {
        CatalogsProductGroupProductCountsObject[["out_of_stock"]] <-
          self$`out_of_stock`
      }
      if (!is.null(self$`preorder`)) {
        CatalogsProductGroupProductCountsObject[["preorder"]] <-
          self$`preorder`
      }
      if (!is.null(self$`total`)) {
        CatalogsProductGroupProductCountsObject[["total"]] <-
          self$`total`
      }
      CatalogsProductGroupProductCountsObject
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupProductCounts
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupProductCounts
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`in_stock`)) {
        self$`in_stock` <- this_object$`in_stock`
      }
      if (!is.null(this_object$`out_of_stock`)) {
        self$`out_of_stock` <- this_object$`out_of_stock`
      }
      if (!is.null(this_object$`preorder`)) {
        self$`preorder` <- this_object$`preorder`
      }
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsProductGroupProductCounts in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`in_stock`)) {
          sprintf(
          '"in_stock":
            %d
                    ',
          self$`in_stock`
          )
        },
        if (!is.null(self$`out_of_stock`)) {
          sprintf(
          '"out_of_stock":
            %d
                    ',
          self$`out_of_stock`
          )
        },
        if (!is.null(self$`preorder`)) {
          sprintf(
          '"preorder":
            %d
                    ',
          self$`preorder`
          )
        },
        if (!is.null(self$`total`)) {
          sprintf(
          '"total":
            %d
                    ',
          self$`total`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsProductGroupProductCounts
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsProductGroupProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsProductGroupProductCounts
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`in_stock` <- this_object$`in_stock`
      self$`out_of_stock` <- this_object$`out_of_stock`
      self$`preorder` <- this_object$`preorder`
      self$`total` <- this_object$`total`
      self
    },
    #' Validate JSON input with respect to CatalogsProductGroupProductCounts
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsProductGroupProductCounts and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `in_stock`
      if (!is.null(input_json$`in_stock`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupProductCounts: the required field `in_stock` is missing."))
      }
      # check the required field `out_of_stock`
      if (!is.null(input_json$`out_of_stock`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupProductCounts: the required field `out_of_stock` is missing."))
      }
      # check the required field `preorder`
      if (!is.null(input_json$`preorder`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupProductCounts: the required field `preorder` is missing."))
      }
      # check the required field `total`
      if (!is.null(input_json$`total`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsProductGroupProductCounts: the required field `total` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsProductGroupProductCounts
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
      # check if the required `in_stock` is null
      if (is.null(self$`in_stock`)) {
        return(FALSE)
      }

      if (self$`in_stock` < 0) {
        return(FALSE)
      }

      # check if the required `out_of_stock` is null
      if (is.null(self$`out_of_stock`)) {
        return(FALSE)
      }

      if (self$`out_of_stock` < 0) {
        return(FALSE)
      }

      # check if the required `preorder` is null
      if (is.null(self$`preorder`)) {
        return(FALSE)
      }

      if (self$`preorder` < 0) {
        return(FALSE)
      }

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        return(FALSE)
      }

      if (self$`total` < 0) {
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
      # check if the required `in_stock` is null
      if (is.null(self$`in_stock`)) {
        invalid_fields["in_stock"] <- "Non-nullable required field `in_stock` cannot be null."
      }

      if (self$`in_stock` < 0) {
        invalid_fields["in_stock"] <- "Invalid value for `in_stock`, must be bigger than or equal to 0."
      }

      # check if the required `out_of_stock` is null
      if (is.null(self$`out_of_stock`)) {
        invalid_fields["out_of_stock"] <- "Non-nullable required field `out_of_stock` cannot be null."
      }

      if (self$`out_of_stock` < 0) {
        invalid_fields["out_of_stock"] <- "Invalid value for `out_of_stock`, must be bigger than or equal to 0."
      }

      # check if the required `preorder` is null
      if (is.null(self$`preorder`)) {
        invalid_fields["preorder"] <- "Non-nullable required field `preorder` cannot be null."
      }

      if (self$`preorder` < 0) {
        invalid_fields["preorder"] <- "Invalid value for `preorder`, must be bigger than or equal to 0."
      }

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        invalid_fields["total"] <- "Non-nullable required field `total` cannot be null."
      }

      if (self$`total` < 0) {
        invalid_fields["total"] <- "Invalid value for `total`, must be bigger than or equal to 0."
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
# CatalogsProductGroupProductCounts$unlock()
#
## Below is an example to define the print function
# CatalogsProductGroupProductCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsProductGroupProductCounts$lock()

