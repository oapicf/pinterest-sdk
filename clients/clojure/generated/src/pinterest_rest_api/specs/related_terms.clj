(ns pinterest-rest-api.specs.related-terms
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.related-terms-related-terms-list-inner :refer :all]
            )
  (:import (java.io File)))


(def related-terms-data
  {
   (ds/opt :id) string?
   (ds/opt :related_term_count) int?
   (ds/opt :related_terms_list) (s/coll-of related-terms-related-terms-list-inner-spec)
   })

(def related-terms-spec
  (ds/spec
    {:name ::related-terms
     :spec related-terms-data}))
