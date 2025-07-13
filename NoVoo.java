public class NoVoo {

        private ItemVoo info; // a declaração do tipo Item está no capitulo 1
        private NoVoo prox;
        public NoVoo(ItemVoo elem) {
            this.info = elem;
            this.prox = null;
            // a variável elem contém os dados que serão armazenados
            // esta linha é opcional, pois o prox é automaticamente
            //definido como null
        }
        public NoVoo(ItemVoo info, NoVoo prox) {
            this.info = info;
            this.prox = prox;
        }
        public ItemVoo getInfo() {
            return this.info;
        }
        public void setInfo(ItemVoo elem) {
            this.info = elem;
        }
        public NoVoo getProx() {
            return this.prox;
        }
        public void setProx(NoVoo novoNo) {
            this.prox = novoNo;
        }
    }
