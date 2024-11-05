#' Create a new CatalogsCreativeAssetsProductGroupProductCounts
#'
#' @description
#' Product counts for a Creative Assets CatalogsProductGroup
#'
#' @docType class
#' @title CatalogsCreativeAssetsProductGroupProductCounts
#' @description CatalogsCreativeAssetsProductGroupProductCounts Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field total  numeric
#' @field videos  numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsCreativeAssetsProductGroupProductCounts <- R6::R6Class(
  "CatalogsCreativeAssetsProductGroupProductCounts",
  public = list(
    `catalog_type` = NULL,
    `total` = NULL,
    `videos` = NULL,

    #' @description
    #' Initialize a new CatalogsCreativeAssetsProductGroupProductCounts class.
    #'
    #' @param catalog_type catalog_type
    #' @param total total
    #' @param videos videos
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `total`, `videos`, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("CREATIVE_ASSETS"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`total`)) {
        self$`total` <- `total`
      }
      if (!missing(`videos`)) {
        self$`videos` <- `videos`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsCreativeAssetsProductGroupProductCounts in JSON format
    toJSON = function() {
      CatalogsCreativeAssetsProductGroupProductCountsObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsCreativeAssetsProductGroupProductCountsObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`total`)) {
        CatalogsCreativeAssetsProductGroupProductCountsObject[["total"]] <-
          self$`total`
      }
      if (!is.null(self$`videos`)) {
        CatalogsCreativeAssetsProductGroupProductCountsObject[["videos"]] <-
          self$`videos`
      }
      CatalogsCreativeAssetsProductGroupProductCountsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsProductGroupProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsProductGroupProductCounts
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("CREATIVE_ASSETS"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
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
    #' @return CatalogsCreativeAssetsProductGroupProductCounts in JSON format
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
    #' Deserialize JSON string into an instance of CatalogsCreativeAssetsProductGroupProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsCreativeAssetsProductGroupProductCounts
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("CREATIVE_ASSETS"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"CREATIVE_ASSETS\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`total` <- this_object$`total`
      self$`videos` <- this_object$`videos`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsCreativeAssetsProductGroupProductCounts and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsProductGroupProductCounts: the required field `catalog_type` is missing."))
      }
      # check the required field `total`
      if (!is.null(input_json$`total`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsProductGroupProductCounts: the required field `total` is missing."))
      }
      # check the required field `videos`
      if (!is.null(input_json$`videos`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsCreativeAssetsProductGroupProductCounts: the required field `videos` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsCreativeAssetsProductGroupProductCounts
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

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        return(FALSE)
      }

      if (self$`total` < 0) {
        return(FALSE)
      }

      # check if the required `videos` is null
      if (is.null(self$`videos`)) {
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

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        invalid_fields["total"] <- "Non-nullable required field `total` cannot be null."
      }

      if (self$`total` < 0) {
        invalid_fields["total"] <- "Invalid value for `total`, must be bigger than or equal to 0."
      }

      # check if the required `videos` is null
      if (is.null(self$`videos`)) {
        invalid_fields["videos"] <- "Non-nullable required field `videos` cannot be null."
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
# CatalogsCreativeAssetsProductGroupProductCounts$unlock()
#
## Below is an example to define the print function
# CatalogsCreativeAssetsProductGroupProductCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsCreativeAssetsProductGroupProductCounts$lock()

