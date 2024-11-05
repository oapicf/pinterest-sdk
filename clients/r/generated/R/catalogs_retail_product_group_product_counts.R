#' Create a new CatalogsRetailProductGroupProductCounts
#'
#' @description
#' Product counts for a Retail CatalogsProductGroup
#'
#' @docType class
#' @title CatalogsRetailProductGroupProductCounts
#' @description CatalogsRetailProductGroupProductCounts Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field in_stock  numeric
#' @field out_of_stock  numeric
#' @field preorder  numeric
#' @field total  numeric
#' @field videos  numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailProductGroupProductCounts <- R6::R6Class(
  "CatalogsRetailProductGroupProductCounts",
  public = list(
    `catalog_type` = NULL,
    `in_stock` = NULL,
    `out_of_stock` = NULL,
    `preorder` = NULL,
    `total` = NULL,
    `videos` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailProductGroupProductCounts class.
    #'
    #' @param catalog_type catalog_type
    #' @param in_stock in_stock
    #' @param out_of_stock out_of_stock
    #' @param preorder preorder
    #' @param total total
    #' @param videos videos
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `in_stock`, `out_of_stock`, `preorder`, `total`, `videos` = NULL, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
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
      if (!is.null(`videos`)) {
        self$`videos` <- `videos`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailProductGroupProductCounts in JSON format
    toJSON = function() {
      CatalogsRetailProductGroupProductCountsObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailProductGroupProductCountsObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`in_stock`)) {
        CatalogsRetailProductGroupProductCountsObject[["in_stock"]] <-
          self$`in_stock`
      }
      if (!is.null(self$`out_of_stock`)) {
        CatalogsRetailProductGroupProductCountsObject[["out_of_stock"]] <-
          self$`out_of_stock`
      }
      if (!is.null(self$`preorder`)) {
        CatalogsRetailProductGroupProductCountsObject[["preorder"]] <-
          self$`preorder`
      }
      if (!is.null(self$`total`)) {
        CatalogsRetailProductGroupProductCountsObject[["total"]] <-
          self$`total`
      }
      if (!is.null(self$`videos`)) {
        CatalogsRetailProductGroupProductCountsObject[["videos"]] <-
          self$`videos`
      }
      CatalogsRetailProductGroupProductCountsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailProductGroupProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailProductGroupProductCounts
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
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
      if (!is.null(this_object$`videos`)) {
        self$`videos` <- this_object$`videos`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailProductGroupProductCounts in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
            "%s"
                    ',
          self$`catalog_type`
          )
        },
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
        },
        if (!is.null(self$`videos`)) {
          sprintf(
          '"videos":
            %d
                    ',
          self$`videos`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailProductGroupProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailProductGroupProductCounts
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`in_stock` <- this_object$`in_stock`
      self$`out_of_stock` <- this_object$`out_of_stock`
      self$`preorder` <- this_object$`preorder`
      self$`total` <- this_object$`total`
      self$`videos` <- this_object$`videos`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailProductGroupProductCounts and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroupProductCounts: the required field `catalog_type` is missing."))
      }
      # check the required field `in_stock`
      if (!is.null(input_json$`in_stock`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroupProductCounts: the required field `in_stock` is missing."))
      }
      # check the required field `out_of_stock`
      if (!is.null(input_json$`out_of_stock`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroupProductCounts: the required field `out_of_stock` is missing."))
      }
      # check the required field `preorder`
      if (!is.null(input_json$`preorder`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroupProductCounts: the required field `preorder` is missing."))
      }
      # check the required field `total`
      if (!is.null(input_json$`total`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailProductGroupProductCounts: the required field `total` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailProductGroupProductCounts
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

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

      if (self$`videos` < 0) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

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

      if (self$`videos` < 0) {
        invalid_fields["videos"] <- "Invalid value for `videos`, must be bigger than or equal to 0."
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
# CatalogsRetailProductGroupProductCounts$unlock()
#
## Below is an example to define the print function
# CatalogsRetailProductGroupProductCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailProductGroupProductCounts$lock()

