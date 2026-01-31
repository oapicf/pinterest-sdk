(ns pinterest-rest-api.specs.targeting-spec-gender
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def targeting-spec-gender-data
  {
   })

(def targeting-spec-gender-spec
  (ds/spec
    {:name ::targeting-spec-gender
     :spec targeting-spec-gender-data}))
