import Navbar from './components/Navbar'
import Footer from './components/Footer'
import DataTable from './components/DataTable'

function App() {
  return (
    <>
      <div className="container">
        <Navbar />
        <h1 className="text-primary">Olá mundo!</h1>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
