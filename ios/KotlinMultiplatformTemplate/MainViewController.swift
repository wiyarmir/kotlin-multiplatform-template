import common
import UIKit

class MainViewController: UIViewController, HelloView {
    
    var presenter: HelloPresenter!
    
    @IBOutlet weak var textLabel: UILabel!
    
    @IBAction func onLoadTouch(_ sender: Any) {
        presenter.loadGreeting()
    }
    
    func showGreeting(greeting: Greeting) {
        textLabel.text = greeting.message
    }
    
    func showLoading() {
        textLabel.text = "Loading"
    }
    
    func showError(error: String) {
        print(error)
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        presenter = appDelegate.notDagger.helloPresenter(view: self)
    }
    
    deinit {
        presenter.destroy()
    }
}
