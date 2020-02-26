import React, { Component } from 'react';
class student extends Component {
    state = { 
        isLoading : true,
        student : []
     }
     async componentDidMount()
     {
         const respond = await fetch('/Student/all');
         const body = await respond.json();
         this.setState({student : body , isLoading : false });
     }
    render() { 
        const {student , isLoading } = this.state;
        if(isLoading)
        return(<div>loading.....</div>);
        
        return ( 
    
       <div>

         <h2>Student</h2>
         {
             student.map (students =>
                <div id={students.reg_No}>
                    {students.first_Name}
                     </div>
                )
         }
         
         </div>
         );
    }
}
 
export default student;