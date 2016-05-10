(defproject serpent-talk "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [camel-snake-kebab "0.3.2"]]  ;;camel 프로젝트 추가
  :main serpent-talk.talk)  ;;이렇게 하면 lein run -m serpent-talk.talk "Hello pigeon"이라고 하지않고
                            ;;len run 이렇게 말할 수 있다!!!
