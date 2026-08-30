(ns pinterest-rest-api.specs.ai-disclosure-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ai-disclosure-item-data
  {
   })

(def ai-disclosure-item-spec
  (ds/spec
    {:name ::ai-disclosure-item
     :spec ai-disclosure-item-data}))
