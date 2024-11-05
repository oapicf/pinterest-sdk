(ns pinterest-rest-api.specs.targeting-template-keyword
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.match-type :refer :all]
            )
  (:import (java.io File)))


(def targeting-template-keyword-data
  {
   (ds/opt :match_type) match-type-spec
   (ds/opt :value) string?
   })

(def targeting-template-keyword-spec
  (ds/spec
    {:name ::targeting-template-keyword
     :spec targeting-template-keyword-data}))
