config.output.publicPath = '/frontend/';
config.devServer = {
  proxy: {
    '/': 'http://localhost:9090/',
  },
};
config.stats = 'errors-only';

