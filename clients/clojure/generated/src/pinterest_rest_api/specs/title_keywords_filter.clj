(ns pinterest-rest-api.specs.title-keywords-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def title-keywords-filter-data
  {
   (ds/req :TITLE_KEYWORDS) catalogs-product-group-multiple-string-criteria-spec
   })

(def title-keywords-filter-spec
  (ds/spec
    {:name ::title-keywords-filter
     :spec title-keywords-filter-data}))
